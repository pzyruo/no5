package com.pzyruo.dao;

import com.pzyruo.domain.Goods;
import com.pzyruo.domain.Items;
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

    public List<Items> selectByUser(int userId) throws SQLException {
        List<Items> itemList = new ArrayList<Items>();
        String sql = "SELECT * "
                + " FROM shop_item LEFT JOIN goods "
                + " ON item_goods_id = goods_id "
                + " WHERE item_user_id=?";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setInt(1, userId);
        ResultSet rs = pstat.executeQuery();
        while(rs.next()){
            Items item = new Items();
            item.setItemId(rs.getInt("item_id"));
            item.setItemGoodsNum(rs.getInt("item_goods_num"));
            Goods goods = new Goods();
            goods.setGoodsId(rs.getInt("goods_id"));
            goods.setGoodsImg(rs.getString("goods_img"));
            goods.setGoodsName(rs.getString("goods_name"));
            goods.setGoodsNum(rs.getInt("goods_num"));
            goods.setGoodsPrice(rs.getDouble("goods_price"));
            item.setItemGoods(goods);
            itemList.add(item);
        }
        return itemList;
    }

    public void upDateNum(int itemId,int num){
        String sql = "update shop_item set item_goods_num=? where item_id=?";
        template.update(sql,num,itemId);
    }

    public void deleteByUser(int userId) throws SQLException{
        String sql = "delete from shop_item where item_user_id = ?";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setInt(1, userId);
        pstat.executeUpdate();
    }

}