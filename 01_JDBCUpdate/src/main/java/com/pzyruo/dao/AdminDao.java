package com.pzyruo.dao;

import com.pzyruo.domain.Admins;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 15:25
 * @Version 1.0
 **/
public class AdminDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    public Admins selectByName(String adminName){
        String sql ="select * from admins left join roles " +
                "on admin_role_id =role_id" +
                " where admin_name=?";
        try {
            return template.queryForObject(sql,new BeanPropertyRowMapper<>(Admins.class),adminName);
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;


    }

}