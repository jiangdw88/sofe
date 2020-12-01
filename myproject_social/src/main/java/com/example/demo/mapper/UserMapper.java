package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
//    将数据添加到数据库 注册
     int addUser(User user);
//     查询用户名是否重复
    User findUsername(String username);
//    通过用户名查找密码是否正确完成登录
    User findByUsername(String username,String password);
}
