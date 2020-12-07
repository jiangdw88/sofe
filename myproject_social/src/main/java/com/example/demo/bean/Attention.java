package com.example.demo.bean;

public class Attention {
//    关注表id
    private String attentionId;
//    关注表被关注人id
    private String uId;
//    本人id
    private String userId;
//    状态
    private int status;
//    关注时间
    private String attentionTime;

    public Attention() {
    }

    @Override
    public String toString() {
        return "Attention{" +
                "attentionId='" + attentionId + '\'' +
                ", uId='" + uId + '\'' +
                ", userId='" + userId + '\'' +
                ", status=" + status +
                ", attentionTime='" + attentionTime + '\'' +
                '}';
    }

    public String getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(String attentionId) {
        this.attentionId = attentionId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAttentionTime() {
        return attentionTime;
    }

    public void setAttentionTime(String attentionTime) {
        this.attentionTime = attentionTime;
    }

    public Attention(String attentionId, String uId, String userId, int status, String attentionTime) {
        this.attentionId = attentionId;
        this.uId = uId;
        this.userId = userId;
        this.status = status;
        this.attentionTime = attentionTime;
    }
}
