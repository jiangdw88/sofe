package com.example.demo.service;

import com.example.demo.bean.NewMessage;
import com.example.demo.bean.User;
import com.util.ResponseData;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UserService {
    //     注册接口
    ResponseData<User> register(User user);

    //     登录接口
    ResponseData<User> login(String username, String password);

    //     查询全部有效用户
    ResponseData<List<User>> validUser();

    //     删除用户(假删除)
    ResponseData<Integer> deleteUser(String username, String password);

    /**
     * 7.修改昵称-》更新修改时间
     * 8.修改头像（url）-》更新修改时间
     * 9.修改个人简介-》更新修改时间
     * 10.修改性别-》更新修改时间
     */
    ResponseData<Integer> changeMessage(NewMessage newMessage);
//    ResponseData<Integer> changeMessage( @Param("newMessage") NewMessage newMessage,@Param("user")User user);
    //    8.修改头像（url）-》更新修改时间
    ResponseData<Integer> changeUrl(NewMessage newMessage);

    //9.修改个人简介-》更新修改时间
    ResponseData<Integer> changeProfile(NewMessage newMessage);

    //    10.修改性别-》更新修改时间
    ResponseData<Integer> changeGender(NewMessage newMessage);

    /**
     * 修改密码
     * 通过 id 账户名和旧密码对新密码进行修改
     */
    ResponseData<Integer> changePassword(NewMessage newMessage);

    //    ResponseData<Integer> upLoadImag(String file);
//    根据用户名id查询用户信息
    ResponseData<List<User>> getUserMessage(String userId);

}
