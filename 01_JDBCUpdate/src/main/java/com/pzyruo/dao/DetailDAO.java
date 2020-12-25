package com.pzyruo.dao;

import com.pzyruo.domain.Details;
import com.pzyruo.domain.Goods;
import com.pzyruo.util.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DetailDAO {
	public void insert(Details detail) throws SQLException{
		String sql = "insert into "
				+ " order_details(detail_order_id,detail_goods_id,detail_goods_num,detail_goods_price) "
				+ " values(?,?,?,?)";
		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, detail.getDetailOrder().getOrderId());
		pstat.setInt(2, detail.getDetailGoods().getGoodsId());
		pstat.setInt(3, detail.getDetailGoodsNum());
		pstat.setDouble(4, detail.getDetailGoodsPrice());
		pstat.executeUpdate();
	}
	public List<Details> selectByOrder(String orderId) throws SQLException{
		List<Details> detailList = new ArrayList<Details>();
		String sql = "SELECT *  FROM order_details INNER JOIN goods "
				+ " ON detail_goods_id = goods_id   WHERE detail_order_id = ?";
		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, orderId);
		ResultSet rs = pstat.executeQuery();
		while(rs.next()){
			Details detail = new Details();
			detail.setDetailId(rs.getInt("detail_id"));
			detail.setDetailGoodsNum(rs.getInt("detail_goods_num"));
			detail.setDetailGoodsPrice(rs.getDouble("detail_goods_price"));
			Goods goods = new Goods();
			goods.setGoodsId(rs.getInt("goods_id"));
			goods.setGoodsImg(rs.getString("goods_img"));
			goods.setGoodsName(rs.getString("goods_name"));
			goods.setGoodsNum(rs.getInt("goods_num"));
			goods.setGoodsPrice(rs.getDouble("goods_price"));
			goods.setGoodsDetails(rs.getString("goods_details"));
			detail.setDetailGoods(goods);
			detailList.add(detail);
		}
		return detailList;
	}

}
