package com.pzyruo.controller;

import com.pzyruo.domain.Goods;
import com.pzyruo.domain.Types;
import com.pzyruo.exception.GoodsNameException;
import com.pzyruo.service.GoodsService;
import com.pzyruo.util.FileUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.lang.reflect.Type;


@MultipartConfig
@WebServlet("/admin/goods/save.do")
public class AdminGoodsSave extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Part part = request.getPart("goodsImg");
        // 获取文件真实名称
        String realFileName = part.getSubmittedFileName();
        System.out.println("真实文件名称：" + realFileName);
        // 获取随机名称
        String saveFielName = FileUtil.ReFileName();
        System.out.println("保存文件名称：" + saveFielName);
        // 获取文件后缀
        String saveTypeName = FileUtil.RealFileName(realFileName);
        System.out.println("保存后缀名称：" + saveTypeName);
        String goodsImg = saveFielName + saveTypeName;
        System.out.println("保存图片名称：" + goodsImg);
        // 获取URL对应的物理路径
        String realPath = request.getServletContext().getRealPath("/img/");
        System.out.println("保存物理路径：" + realPath);
        // 调用方法实现另存为
        part.write(realPath + goodsImg);

        Goods goods = new Goods();
        goods.setGoodsName(request.getParameter("goodsName"));
        goods.setGoodsPrice(Double.parseDouble(request.getParameter("goodsPrice")));
        goods.setGoodsNum(Integer.parseInt(request.getParameter("goodsNum")));
        goods.setGoodsImg(goodsImg);
        Types goodTypes = new Types();
        goodTypes.setTypeId(Integer.parseInt(request.getParameter("typeId")));
        goods.setGoodsType(goodTypes);
        System.out.println(goods);
        GoodsService service = new GoodsService();
        try {
            service.save(goods);
            //保存成功，重定向
            response.sendRedirect(request.getContextPath()+"/admin/goods/search.do");
        }catch (GoodsNameException e){
            //保存失败，请求转发
            request.setAttribute("errorInfo",e.getMessage());
            request.getRequestDispatcher("/admin/goods/newgoods.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doPost(request,response);
    }
}
