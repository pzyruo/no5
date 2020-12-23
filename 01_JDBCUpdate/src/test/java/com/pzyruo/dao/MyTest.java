package com.pzyruo.dao;

import com.pzyruo.domain.Goods;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName MyTest
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/16 16:10
 * @Version 1.0
 **/
public class MyTest {
    @Test
    public void test1(){
        GoodsDao dao = new GoodsDao();
        try {
            final List<Goods> goodsList = dao.selectAll();
            System.out.println(goodsList);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}