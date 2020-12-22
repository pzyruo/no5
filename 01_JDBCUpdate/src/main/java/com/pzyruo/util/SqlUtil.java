package com.pzyruo.util;


import com.pzyruo.vo.SearchVO;

public class SqlUtil {
	/**
	 * 返回动态分页子句
	 * 
	 * @param page
	 *            当前页码
	 * @param recordOfPage
	 *            每页记录数量
	 * @return 颁子句
	 */
	public static String getLimit(int page, int recordOfPage) {
		int index = (page - 1) * recordOfPage;
		String limit = " limit "+index+","+recordOfPage;
		return limit;
	}

	public static String getWhere(SearchVO searchVO) {
		String sql = " WHERE 1=1 ";
		if (searchVO.getGoodsName() != null) {
			sql += " and goods_name like '%" + searchVO.getGoodsName() + "%' ";
		}
		if (searchVO.getMinGoodsPrice() != null) {
			sql += " and goods_price >= " + searchVO.getMinGoodsPrice();
		}
		if (searchVO.getMaxGoodsPrice() != null) {
			sql += " and goods_price <= " + searchVO.getMaxGoodsPrice();
		}
		if (searchVO.getTypeId() != null) {
			sql += " and type_id = " + searchVO.getTypeId();
		}
		return sql;
	}
}
