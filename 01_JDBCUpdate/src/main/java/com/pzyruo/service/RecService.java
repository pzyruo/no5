package com.pzyruo.service;

import com.pzyruo.dao.RecDao;
import com.pzyruo.domain.Recipients;
import com.pzyruo.domain.Users;
import com.pzyruo.util.JdbcUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName RecService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/24 9:28
 * @Version 1.0
 **/
public class RecService {
    private RecDao orderDao = new RecDao();
    public List<Recipients> findByUser(Users users) {
        int userId = users.getUserId();
        try {
            final List<Recipients> list = orderDao.findById(userId);
            System.out.println("Service"+list);
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.closeConn();
        }
    }
}