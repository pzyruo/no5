package com.pzyruo.service;

import com.pzyruo.dao.UserDao;
import com.pzyruo.domain.Users;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/24 15:55
 * @Version 1.0
 **/
public class UserService {
    UserDao userDao = new UserDao();
    public Users findUser() {
        return userDao.findUser();
    }
}