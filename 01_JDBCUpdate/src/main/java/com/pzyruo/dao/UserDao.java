package com.pzyruo.dao;

import com.pzyruo.domain.Users;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/24 15:57
 * @Version 1.0
 **/
public class UserDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    public Users findUser() {
        String sql = "select * from users";
        return template.queryForObject(sql,new BeanPropertyRowMapper<>(Users.class));
    }
}