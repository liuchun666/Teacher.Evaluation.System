package com.example.teasystem.entity;

public class User {
    public  int userId;  //用户ID
    public  int  classesId;//班级ID
    public String account;//账户
    public  String password;//密码
    public  String username;//昵称
    public  String sex;//性别
    public  String tel;//电话

    public User() {
    }

    public User(int userId, int classesId, String account, String password, String username, String sex, String tel) {
        this.userId = userId;
        this.classesId = classesId;
        this.account = account;
        this.password = password;
        this.username = username;
        this.sex = sex;
        this.tel = tel;
    }

    public User(int classesId, String account, String password) {
        this.classesId = classesId;
        this.account = account;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
