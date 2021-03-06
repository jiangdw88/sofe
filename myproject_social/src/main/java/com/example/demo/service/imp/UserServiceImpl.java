package com.example.demo.service.imp;

import com.example.demo.bean.NewMessage;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.util.EnumCode;
import com.util.Page;
import com.util.ResponseData;
import com.util.UUIDAndTime;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
//    注册
    public ResponseData<User> register(User user) {
        String password = user.getuPassword();
        String username = user.getuName();
//        判断账户是否重复repead
        User repead = userMapper.findUsername(username);
        if (repead != null) {
            System.out.println(EnumCode.USER_HAS_ERROR.getMessage());
            return ResponseData.error(EnumCode.USER_HAS_ERROR);
        }
//      密码加密
        String md5Str = DigestUtils.md5DigestAsHex(password.getBytes());
//        密码格式 字母开头6-18位
        String regex = "^[a-zA-Z0-9_]{1,}$";
//        判断账户名密码格式
        if (!password.matches(regex)) {
            return ResponseData.error(EnumCode.USERORPASSWORD_ERROR);
        } else if (!username.matches(regex)) {
            return ResponseData.error(EnumCode.USERORPASSWORD_ERROR);
        } else {
//            设置id
            user.setId(UUIDAndTime.getUUID());
//            设置添加时间
            user.setAddtime(UUIDAndTime.getTime());
//            设置更改时间
            user.setCorrecttime(UUIDAndTime.getTime());
//            对密码进行加密
            user.setuPassword(md5Str);
//            设置账户
            user.setStatus(0);
//            设置账户是否可用默认0
            user.setIsuse(0);
            System.out.println(user);
            int code = userMapper.addUser(user);
            if (code >= 1) {
                System.out.println(user);
                return ResponseData.success(user);
            } else {
                System.out.println(EnumCode.USER_HAS_ERROR.getMessage());
                return ResponseData.error(EnumCode.USER_HAS_ERROR);
            }
        }
    }

    //登录功能
    @Override
    public ResponseData<User> login(String username, String password) {
//        密码进加密
//        password = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(password);
//        通过账户名 密码查找用户
        User byUsername = userMapper.login(username, password);
        System.out.println(byUsername);
        if (byUsername != null) {
//            如果非空说明有值密码正确
            System.out.println("密码正确");
            return ResponseData.success(byUsername);
        } else {
//            密码错误
            System.out.println(EnumCode.PASSWORD_ERROR.getMessage());
            return ResponseData.error(EnumCode.PASSWORD_ERROR);
        }
    }

    //查找全部可用用户
    @Override
    public ResponseData<List<User>> validUser() {
        List<User> userList = userMapper.validUser();
        if (userList.size() != 0){
           return ResponseData.success(userList);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }

    //删除用户功能
    @Override
    public ResponseData<Integer> deleteUser(String username, String password) {
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        int code = userMapper.deleteUser(username, password);
        if (code >= 1) {
            System.out.println("删除成功");
            return ResponseData.success(code);
        } else {
            System.out.println(EnumCode.DELETE_FAIL.getMessage());
            return ResponseData.error(EnumCode.DELETE_FAIL);
        }

    }

    //更改用户名
//    要传过来的参数是原用户名,新改的用户名和用户id
    @Override
    public ResponseData<Integer> changeMessage(NewMessage newMessage) {
        String regex = "^[a-zA-Z0-9_]{6,18}$";
//        原用户名
        String username = newMessage.getUserName();
//        新的用户名
        String newUsername = newMessage.getNewUsername();
        newMessage.setCorrecttime(UUIDAndTime.getTime());
        System.out.println(username);
        System.out.println(newMessage);
//        首先验证输入的新用户名和原用户名是否一样 如果不一样调用方法存入数据
        if (!username.equals(newUsername) && username.matches(regex)) {
            int code = userMapper.changeMessage(newMessage);
//            如果正确存入数据库
            if (code >= 1) {
                System.out.println("更改成功" + newMessage);
                return ResponseData.success(code);
//               否则输出错误信息
            } else {
                System.out.println(EnumCode.PARAMETER_ERROR.getMessage());
                return ResponseData.error(EnumCode.PARAMETER_ERROR);
            }
//           如果输入用户名与格式都不正确的情况下输出错误信息
        } else {
            System.out.println(EnumCode.CHANGEMESSAGE_ERROR.getMessage());
            return ResponseData.error(EnumCode.CHANGEMESSAGE_ERROR);
        }
    }


    //更改头像
    @Override
    public ResponseData<Integer> changeUrl(NewMessage newMessage) {
        newMessage.setCorrecttime(UUIDAndTime.getTime());
        int code = userMapper.changeUrl(newMessage);
        if (code >= 1) {
            System.out.println("修改成功");
            return ResponseData.success(code);
        } else {
            System.out.println(EnumCode.PARAMETER_ERROR.getMessage());
            return ResponseData.error(EnumCode.PARAMETER_ERROR);
        }
    }

    //更改个人简介
    @Override
    public ResponseData<Integer> changeProfile(NewMessage newMessage) {
        newMessage.setCorrecttime(UUIDAndTime.getTime());
        int code = userMapper.changeProfile(newMessage);
        if (code >= 1) {
            System.out.println("修改成功");
            return ResponseData.success(code);
        } else {
            System.out.println(EnumCode.PARAMETER_ERROR.getMessage());
            return ResponseData.error(EnumCode.PARAMETER_ERROR);
        }
    }

    //更改性别
    @Override
    public ResponseData<Integer> changeGender(NewMessage newMessage) {
        newMessage.setCorrecttime(UUIDAndTime.getTime());
        int code = userMapper.changeGender(newMessage);
        if (code >= 1) {
            System.out.println("修改成功");
            return ResponseData.success(code);
        } else {
            System.out.println(EnumCode.PARAMETER_ERROR.getMessage());
            return ResponseData.error(EnumCode.PARAMETER_ERROR);
        }
    }

    @Override
    public ResponseData<Integer> changePassword(NewMessage newMessage) {
////    修改密码功能
////        原密码
//        String password = user.getuPassword();
//        System.out.println(password);
//        //        对新密码格式效验 字母开头6-18位
//        String regex = "^[a-zA-Z0-9_]{1,}$";
////        判断新密码格式是否正确
//        if (!newPassword.matches(regex)) {
//            System.out.println(EnumCode.USERORPASSWORD_ERROR.getMessage());
//            return ResponseData.error(EnumCode.USERORPASSWORD_ERROR);
////    判断新密码和旧密码是否一致
//        } else if (password.equals(newPassword)) {
//            System.out.println(EnumCode.SAME_PASSWORD.getMessage());
//            return ResponseData.error(EnumCode.SAME_PASSWORD);
//        } else {
////            如以上两条都通过则对密码进行加密并上传
//            user.setuPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
//            newPassword = DigestUtils.md5DigestAsHex(newPassword.getBytes());
//            user.setCorrecttime(UUIDAndTime.getTime());
////        code为状态码
//            System.out.println("service:" + user);
//            System.out.println("newPassword:" + newPassword);
//            System.out.println("password:" + password);
//            int code = userMapper.changePassword(newPassword, user.getCorrecttime(), user.getuName(), user.getuPassword());
//            System.out.println("service:" + user);
//            System.out.println(code);
//            if (code >= 1) {
//                System.out.println("密码修改成功");
//                return ResponseData.success(code);
//            } else {
//                System.out.println(EnumCode.CHANGEPASSWORD_FAIL.getMessage());
//                return ResponseData.error(EnumCode.CHANGEPASSWORD_FAIL);
//            }
//
        newMessage.setCorrecttime(UUIDAndTime.getTime());
//        newMessage.setCorrecttime("1");
        String correcttime = newMessage.getCorrecttime();
//        String newPassword = newMessage.getNewPassword();
//        newMessage.setNewPassword(DigestUtils.md5DigestAsHex(newPassword.getBytes()));
//        System.out.println(correcttime);
        int code = userMapper.changePassword(newMessage);
        if (code >= 1){
            System.out.println("密码修改成功");
           return ResponseData.success(code);
        }else {
            return ResponseData.error(EnumCode.PARAMETER_ERROR);
        }
    }

    @Override
    public ResponseData<List<User>> getUserMessage(String userId) {
        List<User> userMessage = userMapper.getUserMessage(userId);
        if (userMessage.size() > 0) {
            System.out.println(userMessage);
            return ResponseData.success(userMessage);
        } else {
              System.out.println(EnumCode.PARAMETER_ERROR.getMessage());
              return ResponseData.error(EnumCode.PARAMETER_ERROR);
        }
    }
}