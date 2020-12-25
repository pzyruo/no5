package com.pzyruo.dao;

import com.pzyruo.domain.Goods;
import com.pzyruo.domain.Types;
import com.pzyruo.util.JdbcUtils;
import com.pzyruo.util.SqlUtil;
import com.pzyruo.vo.SearchVO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GoodsDao
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/16 14:15
 * @Version 1.0
 **/
public class GoodsDao {
    JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());


    public int getRecordCount(SearchVO vo){
        return 1;
    }
    /*
            * @Description: 查询所有
            * @Param:  无
            * @Return:  List<Goods>
            * @Throws
            **/
     public List<Goods> selectAll() throws SQLException {
        List<Goods> goodsList = new ArrayList<>();
        String sql = "SELECT * FROM goods LEFT JOIN types on goods_type_id = type_id ";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Goods goods = new Goods();
            goods.setGoodsId(rs.getInt("goods_id"));
            goods.setGoodsImg(rs.getString("goods_img"));
            goods.setGoodsName(rs.getString("goods_name"));
            goods.setGoodsNum(rs.getInt("goods_num"));
            goods.setGoodsPrice(rs.getDouble("goods_price"));
            goods.setGoodsImg(rs.getString("goods_img"));
            Types goodsType = new Types();
            goodsType.setTypeId(rs.getInt("type_id"));
            goodsType.setTypeName(rs.getString("type_name"));
            goods.setGoodsType(goodsType);
            goodsList.add(goods);
        }
        return goodsList;
    }

    public Goods findGoodsByName(String  name) throws SQLException {
        String sql = "SELECT * FROM goods LEFT JOIN types ON goods_type_id = type_id WHERE goods_name = ?";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,name);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            Goods goods = new Goods();
            goods.setGoodsId(rs.getInt("goods_id"));
            goods.setGoodsImg(rs.getString("goods_img"));
            goods.setGoodsName(rs.getString("goods_name"));
            goods.setGoodsNum(rs.getInt("goods_num"));
            goods.setGoodsPrice(rs.getDouble("goods_price"));
            goods.setGoodsImg(rs.getString("goods_img"));
            Types goodsType = new Types();
            goodsType.setTypeId(rs.getInt("type_id"));
            goodsType.setTypeName(rs.getString("type_name"));

            goods.setGoodsType(goodsType);
            System.out.println("通过名字查找员工"+goods);
            return goods;
        }else {
            return  null;
        }
    }

    /**
     * 增加商品记录的方法
     *
     * @param goods
     *            商品对象
     * @throws SQLException
     */
    public void insert(Goods goods) throws SQLException{
        System.out.println("插入前"+goods);
        String sql = "insert into goods(goods_name,goods_price,goods_num,goods_type_id,goods_img,goods_details) values(?,?,?,?,?,?)";
        final Connection conn = JdbcUtils.getConnection();
        final PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,goods.getGoodsName());
        ps.setDouble(2,goods.getGoodsPrice());
        ps.setInt(3,goods.getGoodsNum());
        ps.setInt(4,goods.getGoodsType().getTypeId());
        ps.setString(5,goods.getGoodsImg());
        ps.setString(6,goods.getGoodsDetails());
        ps.executeUpdate();
    }

    /**
     * 多条件分页查询的方法
     * @param searchVO 条件对象
     * @param page 当前页码
     * @param recordOfPage 每页记录数量
     * @return 当前数据集合
     * @throws SQLException
     */
   public List<Goods> select(SearchVO searchVO,int page,int recordOfPage){
         List<Goods> goodsList = new ArrayList<>();
         String sql = "SELECT * FROM goods LEFT JOIN types ON goods_type_id = type_id "
                 + SqlUtil.getWhere(searchVO)
                 + " order by goods_price desc "
                 + SqlUtil.getLimit(page, recordOfPage);

       return template.query(sql, new BeanPropertyRowMapper<>(Goods.class));
   }

    public void updateNum(int goodsId,int num) throws SQLException{
        String sql = "update goods set goods_num = ? where goods_id = ?";
        Connection conn = JdbcUtils.getConnection();
        PreparedStatement pstat = conn.prepareStatement(sql);
        pstat.setInt(1, num);
        pstat.setInt(2, goodsId);
        pstat.executeUpdate();
    }

}