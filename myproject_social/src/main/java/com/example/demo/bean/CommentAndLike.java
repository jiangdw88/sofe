package com.example.demo.bean;

//评论和点赞数
public class CommentAndLike {
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
    //    点赞数
    private String count;

    @Override
    public String toString() {
        return "CommentAndLike{" +
                "commentId='" + commentId + '\'' +
                ", uId='" + uId + '\'' +
                ", dId='" + dId + '\'' +
                ", userId='" + userId + '\'' +
                ", comment='" + comment + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", count='" + count + '\'' +
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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public CommentAndLike() {
    }

    public CommentAndLike(String commentId, String uId, String dId, String userId, String comment, String commentTime, String count) {
        this.commentId = commentId;
        this.uId = uId;
        this.dId = dId;
        this.userId = userId;
        this.comment = comment;
        this.commentTime = commentTime;
        this.count = count;
    }
}
