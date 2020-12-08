package com.example.demo.controller;

import com.example.demo.bean.NewMessage;
import com.example.demo.bean.User;
import com.util.ResponseData;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserController {
    ResponseData<Integer> register(User user);
    ResponseData<User> login(String username, String password);
    List<User> validUser();
    ResponseData<Integer> deleteUser(String username,String password);
//    更改用户名
    ResponseData<Integer> changeMessage(User user,String newUsername);
    //    8.修改头像（url）-》更新修改时间
    ResponseData<Integer> changeUrl(NewMessage newMessage);
    //9.修改个人简介-》更新修改时间
    ResponseData<Integer> changeProfile(NewMessage newMessage);
    //    10.修改性别-》更新修改时间
    ResponseData<Integer> changeGender(NewMessage newMessage);
    ResponseData<Integer> changePassword(User user,String newPassword);
}
