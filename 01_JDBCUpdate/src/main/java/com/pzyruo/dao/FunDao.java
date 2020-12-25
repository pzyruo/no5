package com.pzyruo.dao;

import com.pzyruo.domain.Funs;
import com.pzyruo.domain.Roles;

import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
*
*
* */


/**
 * @ClassName FunDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 16:03
 * @Version 1.0
 **/
public class FunDao {

    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    /**
     * 按角色查询一级列表方法
     * @param roleId 角色编号
     * @return 一级列表集合
     * @throws SQLException
     */
    public List<Funs> selectOneFun(int roleId) throws SQLException {
        List<Funs> funList = new ArrayList<Funs>();
        String sql = "select * from funs where fun_id in "
                + " (select permission_fun_id from permissions where permission_role_id = ?) "
                + " order by fun_sort";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setInt(1, roleId);
        ResultSet rs = pstat.executeQuery();
        while(rs.next()){
            Funs fun = new Funs();
            fun.setFunId(rs.getInt("fun_id"));
            fun.setFunLevel(rs.getInt("fun_level"));
            fun.setFunName(rs.getString("fun_name"));
            fun.setFunSort(rs.getInt("fun_sort"));
            funList.add(fun);
        }
        return funList;
    }

    /**
     * 按一级编号查询二级列表方法
     * @param funId 一级功能编号
     * @return 二级列表集合
     * @throws SQLException
     */
    public List<Funs> selectSecFun(int funId) throws SQLException{
        List<Funs> funList = new ArrayList<Funs>();
        String sql = "select * from funs where fun_pid = ? order by fun_sort";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setInt(1, funId);
        ResultSet rs = pstat.executeQuery();
        while(rs.next()){
            Funs fun = new Funs();
            fun.setFunId(rs.getInt("fun_id"));
            fun.setFunLevel(rs.getInt("fun_level"));
            fun.setFunName(rs.getString("fun_name"));
            fun.setFunSort(rs.getInt("fun_sort"));
            fun.setFunTarget(rs.getString("fun_target"));
            fun.setFunUrl(rs.getString("fun_url"));
            Funs pfun = new Funs();
            pfun.setFunId(rs.getInt("fun_pid"));
            fun.setPfun(pfun);
            funList.add(fun);
        }
        return funList;
    }


}