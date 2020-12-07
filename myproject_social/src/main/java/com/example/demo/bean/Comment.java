package com.example.demo.bean;
//评论表
public class Comment {
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

    @Override
    public String toString() {
        return "Comment{" +
                "commentId='" + commentId + '\'' +
                ", uId='" + uId + '\'' +
                ", dId='" + dId + '\'' +
                ", userId='" + userId + '\'' +
                ", comment='" + comment + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", status='" + status + '\'' +
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

    public Comment() {
    }

    public Comment(String commentId, String uId, String dId, String userId, String comment, String commentTime, int status) {
        this.commentId = commentId;
        this.uId = uId;
        this.dId = dId;
        this.userId = userId;
        this.comment = comment;
        this.commentTime = commentTime;
        this.status = status;
    }
}
