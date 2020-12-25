package com.pzyruo.domain;

import java.util.Date;
import java.util.List;

public class Orders {
	// order_id varchar
	private String orderId;
	// order_user_id int
	private int orderUserId;
	private Users orderUser;
	// order_time datetime
	private Date orderTime;
	// order_consignee varchar
	private String orderConsignee;
	// order_phone varchar
	private String orderPhone;
	// order_address varchar
	private String orderAddress;
	// order_price double
	private double orderPrice;
	// order_status_id int
	private int orderStatusId;
	private Status orderStatus;
	private List<Details> detailList;//订单中的明细集合，一个订单可以找到多个明细
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getOrderUserId() {
		return orderUserId;
	}
	public void setOrderUserId(int orderUserId) {
		this.orderUserId = orderUserId;
	}
	public Users getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(Users orderUser) {
		this.orderUser = orderUser;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getOrderConsignee() {
		return orderConsignee;
	}
	public void setOrderConsignee(String orderConsignee) {
		this.orderConsignee = orderConsignee;
	}
	public String getOrderPhone() {
		return orderPhone;
	}
	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getOrderStatusId() {
		return orderStatusId;
	}
	public void setOrderStatusId(int orderStatusId) {
		this.orderStatusId = orderStatusId;
	}
	public Status getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}
	public List<Details> getDetailList() {
		return detailList;
	}
	public void setDetailList(List<Details> detailList) {
		this.detailList = detailList;
	}


	@Override
	public String toString() {
		return "Orders{" +
				"orderId='" + orderId + '\'' +
				", orderUserId=" + orderUserId +
				", orderUser=" + orderUser +
				", orderTime=" + orderTime +
				", orderConsignee='" + orderConsignee + '\'' +
				", orderPhone='" + orderPhone + '\'' +
				", orderAddress='" + orderAddress + '\'' +
				", orderPrice=" + orderPrice +
				", orderStatusId=" + orderStatusId +
				", orderStatus=" + orderStatus +
				", detailList=" + detailList +
				'}';
	}
}
