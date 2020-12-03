package com.example.demo.bean;

import java.util.Date;

public class User {
    /**
     * 密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)
     * 账号（以字母开头，长度在6~18之间，只能包含字母、数字和下划线）
     */
//    用户id
    private String id;
    //    用户名
    private String uName;
    //    密码
    private String uPassword;
    //    图片连接
    private String uUrl;
    //    性别(0男 1女)
    private Integer uGender;
    //    个人简介
    private String profile;
    //    添加时间
    private String addtime;
    //    修改时间
    private String correcttime;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uUrl='" + uUrl + '\'' +
                ", uGender=" + uGender +
                ", profile='" + profile + '\'' +
                ", addtime='" + addtime + '\'' +
                ", correcttime='" + correcttime + '\'' +
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

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuUrl() {
        return uUrl;
    }

    public void setuUrl(String uUrl) {
        this.uUrl = uUrl;
    }

    public Integer getuGender() {
        return uGender;
    }

    public void setuGender(Integer uGender) {
        this.uGender = uGender;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getCorrecttime() {
        return correcttime;
    }

    public void setCorrecttime(String correcttime) {
        this.correcttime = correcttime;
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

    public User(String id, String uName, String uPassword, String uUrl, Integer uGender, String profile, String addtime, String correcttime, Integer status, Integer isuse) {
        this.id = id;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uUrl = uUrl;
        this.uGender = uGender;
        this.profile = profile;
        this.addtime = addtime;
        this.correcttime = correcttime;
        this.status = status;
        this.isuse = isuse;
    }

    //    状态码是否有效(0有效 1无效)
    private Integer status;
    //    是否可用(0可用 1不可用)
    private Integer isuse;
}