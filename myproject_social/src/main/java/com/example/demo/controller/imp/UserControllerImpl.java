package com.example.demo.controller.imp;

import com.example.demo.bean.NewMessage;
import com.example.demo.bean.User;
import com.example.demo.controller.UserController;
import com.example.demo.service.imp.UserServiceImpl;
import com.util.LoadImage;
import com.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    public ResponseData<User> register(User user) {
        System.out.println(user);
        ResponseData<User> registerCode = userService.register(user);
        return registerCode;
    }

    @ResponseBody
    @ApiOperation(value = "login", notes = "登录接口")
    @PostMapping("/login")
    @Override
    public ResponseData<User> login(String username, String password) {
        System.out.println("测试..........................");
        System.out.println(username);
        System.out.println(password);
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
    public ResponseData<Integer> changeMessage(NewMessage newMessage) {
        return userService.changeMessage(newMessage);
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
        System.out.println(newMessage);
        return userService.changeGender(newMessage);
    }

    @ResponseBody
    @ApiOperation(value = "changPassword", notes = "修改密码")
    @PostMapping("/changPassword")
    @Override
    public ResponseData<Integer> changePassword(NewMessage newMessage) {
        System.out.println(newMessage);
        ResponseData<Integer> integerResponseData = userService.changePassword(newMessage);
        return integerResponseData;
    }
    @ResponseBody
    @ApiOperation(value = "getUserMessage", notes = "查询用户信息")
    @PostMapping("/getUserMessage")
    @Override
    public ResponseData<List<User>> getUserMessage(String userId) {
        return userService.getUserMessage(userId);
    }
//上传图片
    @RequestMapping("/uploadOneImage" )
    @ResponseBody
    public ResponseData<List<String>> uploadOneImage(@RequestParam("file[]") MultipartFile[] files) throws IOException {
        System.out.println(files.length);
        List urlname = LoadImage.uploadManyImage(files);
        return ResponseData.success(urlname);
    }



}
