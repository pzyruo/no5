package com.pzyruo.listener;

import com.pzyruo.domain.Types;
import com.pzyruo.service.TypesService;

import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class ServletListener implements ServletContextListener {
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("应用程序对象的销毁");
    }
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("应用程序对象的创建");
    	//获取应用程序使用域对象
    	ServletContext application = arg0.getServletContext();
    	TypesService typesService = new TypesService();
    	List<Types> typeList = typesService.findAll();
    	application.setAttribute("typeList", typeList);
    	
    }
}
