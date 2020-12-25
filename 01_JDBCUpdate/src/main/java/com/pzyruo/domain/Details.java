package com.pzyruo.domain;

public class Details {
	// detail_id int
	private int detailId;
	// detail_order_id varchar
	private Orders detailOrder;//明细中的订单对象，因为一个明细只属于一个订单
	// detail_goods_id int
	private Goods detailGoods;
	// detail_goods_num int
	private int detailGoodsNum;
	// detail_goods_price double
	private double detailGoodsPrice;
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public Orders getDetailOrder() {
		return detailOrder;
	}
	public void setDetailOrder(Orders detailOrder) {
		this.detailOrder = detailOrder;
	}
	public Goods getDetailGoods() {
		return detailGoods;
	}
	public void setDetailGoods(Goods detailGoods) {
		this.detailGoods = detailGoods;
	}
	public int getDetailGoodsNum() {
		return detailGoodsNum;
	}
	public void setDetailGoodsNum(int detailGoodsNum) {
		this.detailGoodsNum = detailGoodsNum;
	}
	public double getDetailGoodsPrice() {
		return detailGoodsPrice;
	}
	public void setDetailGoodsPrice(double detailGoodsPrice) {
		this.detailGoodsPrice = detailGoodsPrice;
	}
	
	
}
