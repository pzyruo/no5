package com.pzyruo.domain;

/**
 * @ClassName Users
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/22 21:06
 * @Version 1.0
 **/
public class Users {
    // user_id int
    private int userId;
    // user_name varchar
    private String userName;
    // user_pass varchar
    private String userPass;
    // user_phone varchar
    private String userPhone;

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPass() {
        return userPass;
    }
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}