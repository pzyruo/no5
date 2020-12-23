package com.pzyruo.dao;

import com.pzyruo.domain.Items;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @ClassName ItemsDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/22 21:28
 * @Version 1.0
 **/
public class ItemsDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    //保存数据
    public void insert(Items items){
        String sql = "insert into shop_item(item_user_id,item_goods_id,item_goods_num) values(?,?,?)";
        int userId = items.getItemUser().getUserId();
        int goodsId = items.getItemGoods().getGoodsId();
        int itemGoodsNum = items.getItemGoodsNum();
        template.update(sql,userId,goodsId,itemGoodsNum);
    }

    //更新数据
    public void updateNum(int itemId,int num){
        String sql = "update shop_item set item_goods_num=? where item_id = ?";
        template.update(sql,num,itemId);
    }
    /**
     * 按用户编号和商品编号查询购物项的方法
     * @param userId 用户编号
     * @param goodsId 商品编号
     * @return 购物项对象，如果没有查询到返回null
     * @throws
     */

    public Items selectByUserAndGoods(int userId,int goodsId){
        String sql = "select * from shop_item  where item_user_id = ? and item_goods_id = ?";
        try {
            return template.queryForObject(sql,new BeanPropertyRowMapper<>(Items.class),userId,goodsId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Items selectAll() {
        String sql = "select * from shop_item";
        try {
            return template.queryForObject(sql,new BeanPropertyRowMapper<>(Items.class));
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}