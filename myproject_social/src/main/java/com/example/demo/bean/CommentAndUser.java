package com.example.demo.bean;

public class CommentAndUser {
    //    评论表id
    private String commentId;
    //    被评论人id
    private String uId;
    //    评论动态id
    private String dId;
    //    评论用户id
    private String userId;
    //    评论内容
    private String comment;
    //    评论时间
    private String commentTime;
    //    状态
    private int status;

    public CommentAndUser() {
    }

    @Override
    public String toString() {
        return "CommentAndUser{" +
                "commentId='" + commentId + '\'' +
                ", uId='" + uId + '\'' +
                ", dId='" + dId + '\'' +
                ", userId='" + userId + '\'' +
                ", comment='" + comment + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", status=" + status +
                ", id='" + id + '\'' +
                ", uName='" + uName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uUrl='" + uUrl + '\'' +
                ", uGender=" + uGender +
                ", profile='" + profile + '\'' +
                '}';
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public CommentAndUser(String commentId, String uId, String dId, String userId, String comment, String commentTime, int status, String id, String uName, String uPassword, String uUrl, Integer uGender, String profile) {
        this.commentId = commentId;
        this.uId = uId;
        this.dId = dId;
        this.userId = userId;
        this.comment = comment;
        this.commentTime = commentTime;
        this.status = status;
        this.id = id;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uUrl = uUrl;
        this.uGender = uGender;
        this.profile = profile;
    }

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

}
