package com.example.demo.bean;
//自己封装的返回值类返回动态表内容和点赞表id
public class LikeIdAndDynamic {
    //    点赞表id
    private String likeId;
    //    动态表id
    private String dId;
    //    动态表头
    private String title;

    public LikeIdAndDynamic() {
    }

    @Override
    public String toString() {
        return "LikeIdAndDynamic{" +
                "likeId='" + likeId + '\'' +
                ", dId='" + dId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", status=" + status +
                ", sortId='" + sortId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
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

    public LikeIdAndDynamic(String likeId, String dId, String title, String content, String releaseTime, int status, String sortId, String userId) {
        this.likeId = likeId;
        this.dId = dId;
        this.title = title;
        this.content = content;
        this.releaseTime = releaseTime;
        this.status = status;
        this.sortId = sortId;
        this.userId = userId;
    }

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
}
