package com.example.demo.controller;

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
    ResponseData<Integer> changeMessage(User user,String newUsername);
    ResponseData<Integer> changePassword(User user,String newPassword);
}
