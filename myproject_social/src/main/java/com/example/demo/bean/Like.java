package com.example.demo.bean;

public class Like {
//    点赞表id
    private String likeId;
//    被点赞动态id
    private String likepersonId;
//    点赞人id
    private String userId;
//    点赞时间
    private String likeTime;
//    状态
    private int status;

    @Override
    public String toString() {
        return "Like{" +
                "likeId='" + likeId + '\'' +
                ", likepersonId='" + likepersonId + '\'' +
                ", userId='" + userId + '\'' +
                ", likeTime='" + likeTime + '\'' +
                ", status=" + status +
                '}';
    }

    public String getLikeId() {
        return likeId;
    }

    public void setLikeId(String likeId) {
        this.likeId = likeId;
    }

    public String getLikepersonId() {
        return likepersonId;
    }

    public void setLikepersonId(String likepersonId) {
        this.likepersonId = likepersonId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLikeTime() {
        return likeTime;
    }

    public void setLikeTime(String likeTime) {
        this.likeTime = likeTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Like() {
    }

    public Like(String likeId, String likepersonId, String userId, String likeTime, int status) {
        this.likeId = likeId;
        this.likepersonId = likepersonId;
        this.userId = userId;
        this.likeTime = likeTime;
        this.status = status;
    }
}
