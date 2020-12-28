package com.pzyruo.vo;
/**
 * 一个封装查询条件的值对象
 * @author sun1xu
 */
public class SearchVO {
	//商品名称
	private String goodsName;
	//最小价格
	private Double minGoodsPrice;
	//最大价格
	private Double maxGoodsPrice;
	//类型编号
	private Integer typeId;
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getMinGoodsPrice() {
		return minGoodsPrice;
	}
	public void setMinGoodsPrice(Double minGoodsPrice) {
		this.minGoodsPrice = minGoodsPrice;
	}
	public Double getMaxGoodsPrice() {
		return maxGoodsPrice;
	}
	public void setMaxGoodsPrice(Double maxGoodsPrice) {
		this.maxGoodsPrice = maxGoodsPrice;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "SearchVO{" +
				"goodsName='" + goodsName + '\'' +
				", minGoodsPrice=" + minGoodsPrice +
				", maxGoodsPrice=" + maxGoodsPrice +
				", typeId=" + typeId +
				'}';
	}
}
