package com.pzyruo.service;

import com.pzyruo.dao.ItemsDao;
import com.pzyruo.domain.Goods;
import com.pzyruo.domain.Items;
import com.pzyruo.domain.Users;
import com.pzyruo.util.JdbcUtils;

import java.sql.SQLException;

/**
 * @ClassName ItemService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/22 21:12
 * @Version 1.0
 **/
public class ItemService {
    ItemsDao itemsDao = new ItemsDao();
    public void add(Users user, Goods goods, int goodsNum) {
        try {
            Items item = this.itemsDao.selectByUserAndGoods(user.getUserId(),goods.getGoodsId());
            JdbcUtils.getConnection().setAutoCommit(false);
            if (item==null){
                Items items = new Items();
                items.setItemGoods(goods);
                items.setItemUser(user);
                items.setItemGoodsNum(goodsNum);
                this.itemsDao.insert(items);
            }else {
                this.itemsDao.updateNum(item.getItemId(),item.getItemGoodsNum()+goodsNum);
            }JdbcUtils.getConnection().commit();
        }catch (Exception e){
            try {
                JdbcUtils.getConnection().rollback();
            } catch (SQLException troubles) {
                troubles.printStackTrace();
            }
        }finally {
            JdbcUtils.closeConn();
        }




    }

    public Items selectAll() {
        


        try {
           return itemsDao.selectAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeConn();
        }
        return null;


    }
}