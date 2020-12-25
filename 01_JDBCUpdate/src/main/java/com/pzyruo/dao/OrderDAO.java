package com.pzyruo.dao;

import com.pzyruo.domain.Orders;
import com.pzyruo.domain.Status;
import com.pzyruo.util.DateUtil;
import com.pzyruo.util.JdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.*;
import java.text.ParseException;


public class OrderDAO {
	JdbcTemplate template =new JdbcTemplate(JdbcUtils.getDataSource());
	public void insert(Orders order) throws SQLException{
		String sql = "insert into orders values(?,?,?,?,?,?,?,?)";
		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, order.getOrderId());
		pstat.setInt(2, order.getOrderUser().getUserId());
		pstat.setDate(3, new Date( order.getOrderTime().getTime() ));
		pstat.setString(4, order.getOrderConsignee());
		pstat.setString(5, order.getOrderPhone());
		pstat.setString(6, order.getOrderAddress());
		pstat.setDouble(7, order.getOrderPrice());
		pstat.setInt(8, order.getOrderStatus().getStatusId());
		pstat.executeUpdate();
	}


	public Orders selectById(String orderId) throws SQLException, ParseException {
		String sql = "select * from orders where order_id = ?";
		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstat = conn.prepareStatement(sql);
		pstat.setString(1, orderId);
		ResultSet rs = pstat.executeQuery();
		if (rs.next()) {
			Orders order = new Orders();
			order.setOrderAddress(rs.getString("order_address"));
			order.setOrderConsignee(rs.getString("order_consignee"));
			order.setOrderId(rs.getString("order_id"));
			order.setOrderPhone(rs.getString("order_phone"));
			order.setOrderPrice(rs.getDouble("order_price"));
			Status orderStatus = new Status();
			orderStatus.setStatusId(rs.getInt("order_status_id"));
			order.setOrderStatus(orderStatus);
			order.setOrderTime(DateUtil.strToDate(rs.getString("order_time")));
			return order;
		} else {
			return null;
		}
	}
	public void updateStatus(String orderId,int statusId){
		String sql = "update orders set order_status_id=? where order_id=？";
		template.update(sql,statusId,orderId);

	}
}
