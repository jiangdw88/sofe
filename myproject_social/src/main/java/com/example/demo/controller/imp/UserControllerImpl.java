package com.example.demo.controller.imp;

import com.example.demo.bean.NewMessage;
import com.example.demo.bean.User;
import com.example.demo.controller.UserController;
import com.example.demo.service.imp.UserServiceImpl;
import com.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
@Api(value = "User")
public class UserControllerImpl implements UserController {
    @Autowired
    private UserServiceImpl userService;

    //
    @ResponseBody
    @ApiOperation(value = "register", notes = "注册接口")
    @PostMapping("/register")
    @Override
    public ResponseData<Integer> register(User user) {
        System.out.println(user);
        ResponseData<Integer> registerCode = userService.register(user);
        return registerCode;
    }

    @ResponseBody
    @ApiOperation(value = "login", notes = "登录接口")
    @PostMapping("/login")
    @Override
    public ResponseData<User> login(String username, String password) {
        ResponseData<User> login = userService.login(username, password);
        return login;
    }

    @ResponseBody
    @ApiOperation(value = "validUser", notes = "查询有效用户")
    @PostMapping("/validUser")
    @Override
    public ResponseData<List<User>> validUser() {
        return userService.validUser();
    }

    @ResponseBody
    @ApiOperation(value = "deleteUser", notes = "通过用户名删除用户")
    @PostMapping("/deleteUser")
    @Override
    public ResponseData<Integer> deleteUser(String username, String password) {
        ResponseData<Integer> integerResponseData = userService.deleteUser(username, password);
        return integerResponseData;
    }


    @ResponseBody
    @ApiOperation(value = "changeMessage", notes = "更改用户名")
    @PostMapping("/changeMessage")
    @Override
    public ResponseData<Integer> changeMessage(User user, String newUsername) {
        return userService.changeMessage(user,newUsername);
    }

    @ResponseBody
    @ApiOperation(value = "changeUrl", notes = "更改头像")
    @PostMapping("/changeUrl")
    @Override
    public ResponseData<Integer> changeUrl(NewMessage newMessage) {
        return userService.changeUrl(newMessage);
    }

    @ResponseBody
    @ApiOperation(value = "changeProfile", notes = "更改个人简介")
    @PostMapping("/changeProfile")
    @Override
    public ResponseData<Integer> changeProfile(NewMessage newMessage) {
        return userService.changeProfile(newMessage);
    }

    @ResponseBody
    @ApiOperation(value = "changeGender", notes = "更改性别")
    @PostMapping("/changeGender")
    @Override
    public ResponseData<Integer> changeGender(NewMessage newMessage) {
        return userService.changeGender(newMessage);
    }

    @ResponseBody
    @ApiOperation(value = "changPassword", notes = "修改密码")
    @PostMapping("/changPassword")
    @Override
    public ResponseData<Integer> changePassword(User user, String newPassword) {
        ResponseData<Integer> integerResponseData = userService.changePassword(user, newPassword);
        return integerResponseData;
    }


}
