package com.pzyruo.domain;

/**
 * @ClassName Admins
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 14:30
 * @Version 1.0
 **/
public class Admins {
    // admin_id int
    private int adminId;
    // admin_name varchar
    private String adminName;
    // admin_pass varchar
    private String adminPass;
    // admin_role_id int
    private Roles adminRole;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public Roles getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(Roles adminRole) {
        this.adminRole = adminRole;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminPass='" + adminPass + '\'' +
                ", adminRole=" + adminRole +
                '}';
    }
}