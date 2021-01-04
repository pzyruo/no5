package com.pzyruo.dao;

import com.pzyruo.domain.Users;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/24 15:57
 * @Version 1.0
 **/
public class UserDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    public Users findUser(String userPhone)throws SQLException {
        String sql = "select * from users where user_phone=?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<>(Users.class),userPhone);
    }
}