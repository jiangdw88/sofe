package com.example.demo.service;

import com.example.demo.bean.User;
import com.util.ResponseData;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UserService {
    //     注册接口
    ResponseData<Integer> register(User user);

    //     登录接口
    ResponseData<User> login(String username, String password);

    //     查询全部有效用户
    List<User> validUser();

    //     删除用户(假删除)
    ResponseData<Integer> deleteUser(String username,String password);

    /**
     * 7.修改昵称-》更新修改时间
     * 8.修改头像（url）-》更新修改时间
     * 9.修改个人简介-》更新修改时间
     * 10.修改性别-》更新修改时间
     */
    ResponseData<Integer> changeMessage(User user,String newUsername);

    /**
     * 修改密码
     * 通过 id 账户名和旧密码对新密码进行修改
     */
    ResponseData<Integer> changePassword(User user,String newPassword);

}
