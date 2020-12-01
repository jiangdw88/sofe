package com.example.demo.controller.imp;

import com.example.demo.bean.User;
import com.example.demo.controller.UserController;
import com.example.demo.service.UserService;
import com.example.demo.service.imp.UserServiceImpl;
import com.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@Api(value = "User")
public class UserControllerImpl implements UserController {
    @Autowired
    private UserServiceImpl userService;
//
    @ApiOperation(value = "register" , notes = "注册接口")
    @PostMapping("/register")
    @Override
    public ResponseData<Integer> register(User user) {
        System.out.println(user);
        ResponseData<Integer> registerCode = userService.register(user);
        return registerCode;
    }
    @ApiOperation(value = "login" ,notes="登录接口")
    @PostMapping("/login")
    @Override
    public ResponseData<User> login(String username, String password) {
        ResponseData<User> login = userService.login(username, password);
        return login;
    }
}
