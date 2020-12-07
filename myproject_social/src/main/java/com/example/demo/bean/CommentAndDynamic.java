package com.example.demo.bean;

public class CommentAndDynamic {
    //    评论表id
    private String commentId;
    //    评论用户id
    private String userId;
    //    评论内容
    private String comment;
    //    评论时间
    private String commentTime;
    //    状态
    private int status;
    //    动态标题
    private String title;
    //    动态内容
    private String content;
//    状态表id
    private String dId;

    @Override
    public String toString() {
        return "CommentAndDynamic{" +
                "commentId='" + commentId + '\'' +
                ", userId='" + userId + '\'' +
                ", comment='" + comment + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", status='" + status + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", dId='" + dId + '\'' +
                '}';
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
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

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public CommentAndDynamic() {
    }

    public CommentAndDynamic(String commentId, String userId, String comment, String commentTime, int status, String title, String content, String dId) {
        this.commentId = commentId;
        this.userId = userId;
        this.comment = comment;
        this.commentTime = commentTime;
        this.status = status;
        this.title = title;
        this.content = content;
        this.dId = dId;
    }
}
