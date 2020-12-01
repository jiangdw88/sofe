package com.example.demo.service.imp;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.util.EnumCode;
import com.util.ResponseData;
import com.util.UUIDAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
//    注册
    public ResponseData<Integer> register(User user) {
        String password = user.getPassword();
        String username = user.getUsername();
        User repead = userMapper.findUsername(username);
        if (repead != null){
            System.out.println(ResponseData.error(EnumCode.USER_HAS_ERROR));
            return ResponseData.error(EnumCode.USER_HAS_ERROR);
        }

        String md5Str = DigestUtils.md5DigestAsHex(password.getBytes());
        String regex = "[a-zA-Z0-9_]{6,18}";
//        判断账户名密码格式
        if (!password.matches(regex)){
            return ResponseData.error(EnumCode.USERORPASSWORD_ERROR);
        }else if (! username.matches(regex)){
            return ResponseData.error(EnumCode.USERORPASSWORD_ERROR);
        }else{
            user.setId(UUIDAndTime.getUUID());
            user.setAdd_time(UUIDAndTime.getTime());
            user.setCorrect_time(UUIDAndTime.getTime());
            user.setPassword(md5Str);
            user.setStatus(0);
            user.setIsuse(0);
            System.out.println(user);
            int code = userMapper.addUser(user);
            if (code >= 1){
                return ResponseData.success(code);
            }else{
                return ResponseData.error(EnumCode.USER_HAS_ERROR);
            }
        }
    }

    @Override
    public ResponseData<User> login(String username, String password) {
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        User byUsername = userMapper.findByUsername(username, password);
        if (byUsername != null){
//            如果非空说明有值密码正确
            System.out.println("密码正确");
            return ResponseData.success(byUsername);
        }else {
//            密码错误
            System.out.println("密码错误");
            return ResponseData.error(EnumCode.PASSWORD_ERROR);
        }
    }


}
