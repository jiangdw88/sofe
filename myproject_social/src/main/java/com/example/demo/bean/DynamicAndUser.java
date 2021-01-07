package com.example.demo.bean;

public class DynamicAndUser {
    //    动态表id
    private String dId;
    //    动态标题
    private String title;
    //    动态内容
    private String content;
    //    动态发布时间
    private String releaseTime;
    //    状态
    private int status;
    //    分类表id
    private String sortId;
    //    用户表id
    private String userId;
    //用户名
    private String uName;
    //头像
    private String Uurl;

    @Override
    public String toString() {
        return "DynamicAndUser{" +
                "dId='" + dId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", status=" + status +
                ", sortId='" + sortId + '\'' +
                ", userId='" + userId + '\'' +
                ", uName='" + uName + '\'' +
                ", Uurl='" + Uurl + '\'' +
                '}';
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getUurl() {
        return Uurl;
    }

    public void setUurl(String uurl) {
        Uurl = uurl;
    }

    public DynamicAndUser() {
    }

    public DynamicAndUser(String dId, String title, String content, String releaseTime, int status, String sortId, String userId, String uName, String uurl) {
        this.dId = dId;
        this.title = title;
        this.content = content;
        this.releaseTime = releaseTime;
        this.status = status;
        this.sortId = sortId;
        this.userId = userId;
        this.uName = uName;
        Uurl = uurl;
    }
}