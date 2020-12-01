package com.example.demo.controller;

import com.example.demo.bean.User;
import com.util.ResponseData;

public interface UserController {
    ResponseData<Integer> register(User user);
    ResponseData<User> login(String username, String password);

}
