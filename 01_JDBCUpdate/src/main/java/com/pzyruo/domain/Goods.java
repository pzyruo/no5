package com.pzyruo.domain;

public class Goods {
	// goods_id int
	private int goodsId;
	// goods_name varchar
	private String goodsName;
	// goods_price double
	private double goodsPrice;
	// goods_num int
	private int goodsNum;
	// goods_img varchar
	private String goodsImg;
	// goods_type_id int
	private Types goodsType;//一个商品的类型

	private String goodsDetails;

	public String getGoodsDetails() {
		return goodsDetails;
	}

	public void setGoodsDetails(String goodsDetails) {
		this.goodsDetails = goodsDetails;
	}

	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public Types getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(Types goodsType) {
		this.goodsType = goodsType;
	}

	@Override
	public String toString() {
		return "Goods{" +
				"goodsId=" + goodsId +
				", goodsName='" + goodsName + '\'' +
				", goodsPrice=" + goodsPrice +
				", goodsNum=" + goodsNum +
				", goodsImg='" + goodsImg + '\'' +
				", goodsType=" + goodsType +
				'}';
	}
}
