package com.pzyruo.service;

import com.pzyruo.dao.GoodsDao;
import com.pzyruo.domain.Goods;
import com.pzyruo.exception.GoodsNameException;
import com.pzyruo.util.ConnUtil;
import com.pzyruo.util.JdbcUtils;
import com.pzyruo.vo.PageVO;
import com.pzyruo.vo.SearchVO;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName GoodsService
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/16 14:17
 * @Version 1.0
 **/
public class GoodsService {
    private GoodsDao goodsDao = new GoodsDao();
    
    

    
    public List<Goods> findAll() {
        try {
            return goodsDao.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            ConnUtil.closeConn();
        }
        
    }

    public void save(Goods goods) throws GoodsNameException {
        try {
            if (goodsDao.findGoodsByName(goods.getGoodsName()) == null) {
                JdbcUtils.getConnection().setAutoCommit(false);//关闭自动提交事务。改为手动提交事务
                goodsDao.insert(goods);
                JdbcUtils.getConnection().commit();//事务提交
            } else {
                throw new GoodsNameException("商品名称存在！保存商品失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                JdbcUtils.getConnection().rollback();//事务回滚
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            throw new RuntimeException(e);
        } finally {
            JdbcUtils.closeConn();
        }
    }

    /**
     * 多条件分页查询方法
     * @param searchVO 条件对象
     * @param page 当前页码
     * @param recordOfPage 每页记录数量
     * @return 分页对象
     */
    public PageVO<Goods> search(SearchVO searchVO, int page, int recordOfPage) {
        try {
            PageVO<Goods> pageVO = new PageVO<>();
            int recordCount = this.goodsDao.getRecordCount(searchVO);
            int pageCount = ((recordCount - 1) / recordOfPage) + 1;
            if(page<1) page=1;
            if(page>pageCount)page=pageCount;
            List<Goods> goodsList = this.goodsDao.select(searchVO, page, recordOfPage);

            pageVO.setPage(page);
            pageVO.setRecordOfPage(recordOfPage);
            pageVO.setPageCount(pageCount);
            pageVO.setRecordCount(recordCount);
            pageVO.setList(goodsList);
            return pageVO;
        } finally {
            JdbcUtils.closeConn();// 连接关闭
        }
    }



}