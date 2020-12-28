package com.pzyruo.dao;

import com.pzyruo.domain.Admins;
import com.pzyruo.domain.Roles;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 15:25
 * @Version 1.0
 **/
public class AdminDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    public Admins selectByName(String adminName) throws SQLException {
        String sql = "select * from admins left join roles "
                + " on admin_role_id = role_id "
                + " where admin_name=?";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setString(1, adminName);
        ResultSet rs = pstat.executeQuery();
        if (rs.next()) {
            Admins admin = new Admins();
            admin.setAdminId(rs.getInt("admin_id"));
            admin.setAdminName(rs.getString("admin_name"));
            admin.setAdminPass(rs.getString("admin_pass"));

            Roles role = new Roles();
            role.setRoleId(rs.getInt("role_id"));
            role.setRoleName(rs.getString("role_name"));
            admin.setAdminRole(role);
            return admin;
        } else {
            return null;
        }
    }

    }