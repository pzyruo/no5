package com.pzyruo.vo;

import java.util.List;

/**
 * @author 我的电脑
 */
public class PageVO<T> {
	// 1 当前页码 page 用户指定
	private Integer page;
	// 2 每页记录数量 recordOfPage 程序员指定
	private Integer recordOfPage;
	// 3 最大页码 pageCount 公式计算 pageCount =（（recordCount-1）/ recordOfPage）+ 1
	private Integer pageCount;
	// 4 总记录数量 recordCount 查询 select count(*)
	private Integer recordCount;
	// 5 当页记录集合 list 查询 limit
	private List<T> list;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRecordOfPage() {
		return recordOfPage;
	}
	public void setRecordOfPage(int recordOfPage) {
		this.recordOfPage = recordOfPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "PageVO{" +
				"page=" + page +
				", recordOfPage=" + recordOfPage +
				", pageCount=" + pageCount +
				", recordCount=" + recordCount +
				", list=" + list +
				'}';
	}
}
