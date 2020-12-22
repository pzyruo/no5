package com.pzyruo.dao.impl;

import com.pzyruo.domain.Types;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.List;

/**
 * @ClassName TypesDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/21 11:17
 * @Version 1.0
 **/
public class TypesDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    /**
     * 通用的保存类型的方法
     * @param type 类型对象
     * @return 类型的编号
     * @throws SQLException
     */
    public Integer insert(Types types) throws SQLException {
        System.out.println("插入等级1");
        String sql = "insert into types (type_name,type_level,type_pid,type_path) values(?,?,?,?)";
        Connection connection = JdbcUtils.getConnection();

        PreparedStatement ps =  connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,types.getTypeName());
        ps.setInt(2,types.getTypeLevel());
        ps.setInt(3,types.getTypePid());
        ps.setString(4,types.getTypePath());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        return rs.getInt(1);
    }

    /**
     * 通用修改商品类型路径的方法
     * @param id 类型编号
     * @param path 类型路径
     * @throws SQLException
     */
    public void update(Integer id,String path) throws SQLException {
        String sql = "update types set types_path=? where types_id=?";
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,path);
        ps.setInt(2,id);
        ps.executeUpdate();

    }

    public List<Types> findAll() {
        String sql ="select * from types";
        return template.query(sql,new BeanPropertyRowMapper<>(Types.class));
    }

    /**
     * 按编号查询商品类型的方法
     * @param id 类型编号
     * @return 商品类型对象，如果不存在返回null
     * @throws SQLException
     */
    public Types findById(Integer pid) {
        String sql = "select * from types where type_id = ?";
        if (pid==null){
            return null;
        }
        try{
            return template.queryForObject(sql,new BeanPropertyRowMapper<>(Types.class),pid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 按编号查询类型的所有子类型
     * @param id 类型编号
     * @return 类型的所有子类型集合
     * @throws SQLException
     */
    public List<Types> findSubById(int pid){
        String sql = "select * from types where type_pid = ?";
        try {
            return template.query(sql,new BeanPropertyRowMapper<>(Types.class),pid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}