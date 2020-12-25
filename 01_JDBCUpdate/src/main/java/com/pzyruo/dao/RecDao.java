package com.pzyruo.dao;

import com.pzyruo.domain.Recipients;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RecDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/24 9:45
 * @Version 1.0
 **/
public class RecDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    public List<Recipients> findById(int userId) throws SQLException {
        List<Recipients> recList = new ArrayList<Recipients>();
        String sql = "select * from order_recipients where recipients_user_id=?";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setInt(1, userId);
        ResultSet rs = pstat.executeQuery();
        while (rs.next()) {
            Recipients rec = new Recipients();
            rec.setRecAdd(rs.getString("recipients_address"));
            rec.setRecChecked(rs.getInt("recipients_checked"));
            rec.setRecId(rs.getInt("recipients_id"));
            rec.setRecName(rs.getString("recipients_name"));
            rec.setRecPhone(rs.getString("recipients_phone"));
            rec.setRecUserId(rs.getInt("recipients_user_id"));
            // Users user = new Users();
            // user.setUserId(rs.getInt(""));
            // rec.setRecUser(user);
            recList.add(rec);
        }
        return recList;
    }
}