package com.example.demo.bean;

public class User {
    /**
     * 密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)
     * 账号（以字母开头，长度在6~18之间，只能包含字母、数字和下划线）
     */
//    用户id
    private String id;
//    用户名
    private String username;
//    密码
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", gender=" + gender +
                ", profile='" + profile + '\'' +
                ", add_time='" + add_time + '\'' +
                ", correct_time='" + correct_time + '\'' +
                ", status=" + status +
                ", isuse=" + isuse +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getCorrect_time() {
        return correct_time;
    }

    public void setCorrect_time(String correct_time) {
        this.correct_time = correct_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public User() {
    }

    public User(String id, String username, String password, String url, Integer gender, String profile, String add_time, String correct_time, Integer status, Integer isuse) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.url = url;
        this.gender = gender;
        this.profile = profile;
        this.add_time = add_time;
        this.correct_time = correct_time;
        this.status = status;
        this.isuse = isuse;
    }

    //    图片连接
    private String url;
//    性别(0男 1女)
    private Integer gender;
//    个人简介
    private String profile;
//    添加时间
    private String add_time;
//    修改时间
    private String correct_time;
//    状态码是否有效(0有效 1无效)
    private Integer status;
//    是否可用(0可用 1不可用)
    private Integer isuse;
}
