package com.example.demo.mapper;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface UserMapper {
//    将数据添加到数据库 注册
     int addUser(User user);
//     查询用户名是否重复
    User findUsername(String username);
//    通过用户名查找密码是否正确完成登录
    User login(String username,String password);
    //     查询全部有效用户
    List<User> validUser();
//    删除用户
    int deleteUser(String username,String password);
    /**
     * 7.修改昵称-》更新修改时间
     * 8.修改头像（url）-》更新修改时间
     * 9.修改个人简介-》更新修改时间
     * 10.修改性别-》更新修改时间
     * 通过用户名 密码修改个人昵称 头像 个人简介 性别
     */
    int changeMessage(@Param("user") User user,@Param("newUsername") String newUsername);
    /**
     * 修改密码
     * 通过 id 账户名和旧密码对新密码进行修改
     */
    int changePassword(@Param("newPassword") String newPassword,@Param("user") User user);

    int changePassword(@Param("newPassword")String newPassword, @Param("correcttime")String correcttime,@Param("uName") String uName, @Param("uPassword")String uPassword);
}
