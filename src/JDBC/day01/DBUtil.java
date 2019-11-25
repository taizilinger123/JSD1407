package JDBC.day01;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 使用配置文件来配置JDBC连接数据库该类用来管理数据库的连接
 * @author sige
 *
 */
public class DBUtil {
  //连接数据库的路径
  private static String url;
  //连接数据库的用户名
  private static String user;
  //连接数据库的密码
  private static String pwd;
  //静态块
  static{
	  try{
		 //读取配置文件
		 Properties prop = new Properties();
		 /*
		  * 这种写法是将来更加推荐的相对路径写法。
		  */
		 InputStream is = DBUtil.class.getClassLoader().getResourceAsStream("JDBC/day01/config.properties");
		 prop.load(is);
		 //获取驱动
         String driver = prop.getProperty("driver");
         //获取地址
	     url = prop.getProperty("url");
	     //获取用户名
	     user = prop.getProperty("user");
	     //获取密码
	     pwd = prop.getProperty("pwd");
	     
	     //注册驱动
	     Class.forName(driver);
	     
	} catch (Exception e) {
		e.printStackTrace();
	}
  }

  /**
   * 获取一个连接
   * @return
 * @throws Exception 
   */
  public static Connection getConnection() throws Exception{
	  try {
		/*
		 * 通过DriverManager创建一个数据库的连接并返回
		 */
		return DriverManager.getConnection(url,user,pwd);
	} catch (Exception e) {
		e.printStackTrace();
		//通知调用者，创建连接出错
		throw e;
	}
  }
  
  /**
   * 关闭给定的连接
   * @param conn
   */
  public static void closeConnection(Connection conn){
	  try {
		if(conn != null){
            conn.close();			
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
