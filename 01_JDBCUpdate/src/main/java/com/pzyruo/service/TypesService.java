package com.pzyruo.service;

import com.pzyruo.dao.impl.TypesDao;
import com.pzyruo.domain.Types;
import com.pzyruo.util.JdbcUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName TypesService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/21 11:16
 * @Version 1.0
 **/
public class TypesService {
    TypesDao typesDao = new TypesDao();
    public void saveType(Types types,Integer pid){
        try {
            Types ptypes = null;
            if (pid!=null){
              ptypes = this.typesDao.findById(pid);
              types.setTypeId(pid);
              types.setTypeLevel(ptypes.getTypeLevel()+1);
            }else {
                types.setTypeLevel(1);
            }
            JdbcUtils.getConnection().setAutoCommit(false);
            int id = this.typesDao.insert(types);//保存类型时获取类型的编号
            //再更新路径
            String path = null;
            if (pid!=null){
                path = ptypes.getTypePath()+id+"|";
            }else {
                path = "|"+id+"|";
            }
            this.typesDao.update(id,path);
            JdbcUtils.getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                JdbcUtils.getConnection().rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConn();
        }
    }

    public List<Types> findAll() {
        try {
            List<Types> list =  typesDao.findAll();
            System.out.println(list);
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConn();
        }
      return null;
    }

    public Types findById(Integer pid) {
        try {
            Types types = this.typesDao.findById(pid);  //保存当前类型对象
            types.setTypeList(this.typesDao.findSubById(pid));//设置当前类型的子类型集合
            types.setPtype(this.typesDao.findById(types.getTypePid()));//设置当前类型的父类型对象   NUll
            return types;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConn();
        }
        return null;
    }
}