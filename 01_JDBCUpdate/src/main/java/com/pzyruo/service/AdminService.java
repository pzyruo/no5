package com.pzyruo.service;

import com.pzyruo.dao.AdminDao;
import com.pzyruo.domain.Admins;
import com.pzyruo.util.JdbcUtils;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 16:21
 * @Version 1.0
 **/
public class AdminService {
    private AdminDao adminDao = new AdminDao();

    public Admins findByName(String adminName){

        try {
            return this.adminDao.selectByName(adminName);
        }finally {
            JdbcUtils.closeConn();
        }

    }
}