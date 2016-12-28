package com.myfubao.common.utils.db;

import java.sql.Connection;  
import java.sql.DriverManager;  
  
/** 
 * 数据库连接工具类——仅仅获得连接对象 
 * 
 */  
public class ConnDB {  
      
    private static Connection conn = null;  
      
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";  
  
    private static final String URL = "jdbc:mysql://localhost:3306/axt?useUnicode=true&characterEncoding=UTF-8";  
  
    private static final String USER_NAME = "root";  
  
    private static final String PASSWORD = "root";  
      
    public static Connection getConn(){  
        try {  
            Class.forName(DRIVER_NAME);  
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return conn;  
    }  
}