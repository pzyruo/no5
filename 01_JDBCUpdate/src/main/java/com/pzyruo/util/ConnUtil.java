package com.pzyruo.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ClassName ConnUtil
 * @Description TODO
 * @Author 我的电脑
 * @Date 2020/12/16 16:00
 * @Version 1.0
 **/
public class ConnUtil {
    // 1.	声明静态数据源成员变量
    private static DataSource ds;
    private static ThreadLocal<Connection> local = new ThreadLocal<>();
    // 2. 创建连接池对象
    static {
        // 加载配置文件中的数据
        InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties pp = new Properties();
        try {
            pp.load(is);
            // 创建连接池，使用配置文件中的参数

            ds = DruidDataSourceFactory.createDataSource(pp);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn() throws SQLException {
        Connection conn = local.get();
        if (conn == null || conn.isClosed()) {
            conn = ds.getConnection();
            local.set(conn);
        }
        return conn;
    }

    public static void closeConn() {
        try {
            Connection conn = local.get();
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            local.set(null);
        }
    }
}
