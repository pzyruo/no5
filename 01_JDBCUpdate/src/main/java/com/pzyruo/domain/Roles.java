package com.pzyruo.domain;

import java.util.List;

/**
 * @ClassName Roles
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 14:29
 * @Version 1.0
 **/
public class Roles {
    // role_id int
    private int roleId;
    // role_name varchar
    private String roleName;
    private List<Funs> funList;//当前角色的一级功能列表

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Funs> getFunList() {
        return funList;
    }

    public void setFunList(List<Funs> funList) {
        this.funList = funList;
    }
}