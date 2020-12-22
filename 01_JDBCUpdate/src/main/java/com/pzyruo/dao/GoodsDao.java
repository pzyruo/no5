package com.pzyruo.dao;

import com.pzyruo.domain.Goods;

import java.util.List;

/**
 * @ClassName GoodsDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/16 14:14
 * @Version 1.0
 **/
public interface GoodsDao {
    List<Goods> selectAll();
}