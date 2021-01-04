package com.pzyruo.service;

import com.pzyruo.dao.UserDao;
import com.pzyruo.domain.Users;
import com.pzyruo.exception.NameException;

import java.util.Objects;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/24 15:55
 * @Version 1.0
 **/
public class UserService {
    UserDao userDao = new UserDao();
    public Users findUser(String userPhone, String userPass) throws NameException {
        try {
            Users user =this.userDao.findUser(userPhone);
            String servePass = user.getUserPass();
            if (Objects.equals(userPass,servePass)){
                return user;
            }
        }catch (Exception e){
            e.printStackTrace();
           throw new NameException("未找到该用户");
        }
      return null;
    }

}