package com.example.demo.service;

import com.example.demo.bean.User;
import com.util.ResponseData;

public interface UserService {
//     注册接口
     ResponseData<Integer> register(User user);
//     登录接口
     ResponseData<User> login(String username,String password);
}
