package com.example.demo.bean;

public class NewMessage {
    private String id;
    private String correcttime;
    private int newGender;
    private String newUrl;
    private String newProfile;
    private String newUsername;
    private String userName;
    private String newPassword;

    @Override
    public String toString() {
        return "NewMessage{" +
                "id='" + id + '\'' +
                ", correcttime='" + correcttime + '\'' +
                ", newGender=" + newGender +
                ", newUrl='" + newUrl + '\'' +
                ", newProfile='" + newProfile + '\'' +
                ", newUsername='" + newUsername + '\'' +
                ", userName='" + userName + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }

    public NewMessage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorrecttime() {
        return correcttime;
    }

    public void setCorrecttime(String correcttime) {
        this.correcttime = correcttime;
    }

    public int getNewGender() {
        return newGender;
    }

    public void setNewGender(int newGender) {
        this.newGender = newGender;
    }

    public String getNewUrl() {
        return newUrl;
    }

    public void setNewUrl(String newUrl) {
        this.newUrl = newUrl;
    }

    public String getNewProfile() {
        return newProfile;
    }

    public void setNewProfile(String newProfile) {
        this.newProfile = newProfile;
    }

    public String getNewUsername() {
        return newUsername;
    }

    public void setNewUsername(String newUsername) {
        this.newUsername = newUsername;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public NewMessage(String id, String correcttime, int newGender, String newUrl, String newProfile, String newUsername, String userName, String newPassword) {
        this.id = id;
        this.correcttime = correcttime;
        this.newGender = newGender;
        this.newUrl = newUrl;
        this.newProfile = newProfile;
        this.newUsername = newUsername;
        this.userName = userName;
        this.newPassword = newPassword;
    }
}