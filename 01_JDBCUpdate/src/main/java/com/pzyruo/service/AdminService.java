package com.pzyruo.service;

import com.pzyruo.dao.AdminDao;
import com.pzyruo.domain.Admins;
import com.pzyruo.exception.NameException;
import com.pzyruo.exception.PassWordException;
import com.pzyruo.util.JdbcUtils;
import com.pzyruo.util.MD5Util;

import java.sql.SQLException;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 16:21
 * @Version 1.0
 **/
public class AdminService {
    private AdminDao adminDao = new AdminDao();

    public Admins isLogin(String adminName, String adminPass) throws NameException, PassWordException {

        try {
            Admins admin = this.adminDao.selectByName(adminName);
            if (admin==null){
                throw new NameException("管理员不存在");
            }else {
                if (admin.getAdminPass().equals(MD5Util.getMd5(adminPass))){
                    return admin;
                }else {
                    throw  new PassWordException("密码错误");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        }

}