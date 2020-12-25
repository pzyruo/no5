package com.pzyruo.service;

import com.pzyruo.dao.DetailDAO;
import com.pzyruo.dao.GoodsDao;
import com.pzyruo.dao.ItemsDao;
import com.pzyruo.dao.OrderDAO;
import com.pzyruo.domain.Details;
import com.pzyruo.domain.Goods;
import com.pzyruo.domain.Orders;
import com.pzyruo.util.JdbcUtils;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;


public class OrderService {
	private OrderDAO orderDAO = new OrderDAO();
	private DetailDAO detailDAO = new DetailDAO();
	private GoodsDao goodsDAO = new GoodsDao();
	private ItemsDao itemDAO = new ItemsDao();

	/**
	 * 保存订单的方法
	 * 
	 * @param order
	 *            订单对象
	 * @param
	 *
	 * @throws
	 *
	 */
	public void saveOrder(Orders order) {
		try {
			// 订单数据
			JdbcUtils.getConnection().setAutoCommit(false);
			// 保存订单
			this.orderDAO.insert(order);
			// 订单明细和修改库存数量
			for (Details detail : order.getDetailList()) {
				// 保存明细
				this.detailDAO.insert(detail);
				// 修改库存数量
				Goods goods = detail.getDetailGoods();
				int newNum = goods.getGoodsNum() - detail.getDetailGoodsNum();
				this.goodsDAO.updateNum(goods.getGoodsId(), newNum);
			}
			// 清空购物车
			this.itemDAO.deleteByUser(order.getOrderUser().getUserId());
			JdbcUtils.getConnection().commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				JdbcUtils.getConnection().rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException(e);
		} finally {
			JdbcUtils.closeConn();
		}
	}

	public Orders findById(String orderId){
		try {
			Orders order = this.orderDAO.selectById(orderId);
			List<Details> detailList = this.detailDAO.selectByOrder(orderId);
			order.setDetailList(detailList);
			return order;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally{
			JdbcUtils.closeConn();
		}
	}

	public void pay(Orders orders){
		try {
			JdbcUtils.getConnection().setAutoCommit(false);
			this.orderDAO.updateStatus(orders.getOrderId(),3);
			JdbcUtils.getConnection().commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				JdbcUtils.getConnection().rollback();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}finally {
			JdbcUtils.closeConn();
		}
	}
}
