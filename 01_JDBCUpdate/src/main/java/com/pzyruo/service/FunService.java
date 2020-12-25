package com.pzyruo.service;

import com.pzyruo.dao.FunDao;
import com.pzyruo.domain.Funs;
import com.pzyruo.util.ConnUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName FunService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/25 16:23
 * @Version 1.0
 **/
public class FunService {
    private FunDao  funDao = new FunDao();

    public List<Funs> findByRole(int roleId){

            try {
                List<Funs> oneFunList = this.funDao.selectOneFun(roleId);
                for(Funs oneFun:oneFunList){
                    oneFun.setFunList(this.funDao.selectSecFun(oneFun.getFunId()));
                }
                return oneFunList;
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }finally {
                ConnUtil.closeConn();
            }


    }
}