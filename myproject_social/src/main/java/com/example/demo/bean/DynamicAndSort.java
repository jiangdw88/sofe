package com.example.demo.bean;

public class DynamicAndSort {
    //    动态表id
    private String dId;
    //    动态标题
    private String title;
    //    动态内容
    private String content;
    //    动态发布时间
    private String releaseTime;
    //    分类表id
    private String sortId;
    //    用户表id
    private String userId;
//    分类表名
    private String sortName;

    public DynamicAndSort() {
    }

    @Override
    public String toString() {
        return "DynamicAndSort{" +
                "dId='" + dId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", sortId='" + sortId + '\'' +
                ", userId='" + userId + '\'' +
                ", sortName='" + sortName + '\'' +
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

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public DynamicAndSort(String dId, String title, String content, String releaseTime, String sortId, String userId, String sortName) {
        this.dId = dId;
        this.title = title;
        this.content = content;
        this.releaseTime = releaseTime;
        this.sortId = sortId;
        this.userId = userId;
        this.sortName = sortName;
    }
}
