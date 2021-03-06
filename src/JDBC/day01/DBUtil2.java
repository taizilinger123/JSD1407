package JDBC.day01;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * 使用连接池技术管理数据库连接
 * @author sige
 *
 */
public class DBUtil2 { 
  //数据库连接池
  private static BasicDataSource ds;
  //为不同线程管理连接
  private static ThreadLocal<Connection> tl;
  
  static{
	  try{
		Properties prop = new Properties();
		InputStream is = DBUtil2.class.getClassLoader().getResourceAsStream("JDBC/day01/config.properties");
        prop.load(is);
        is.close();
        
        //初始化连接池
        ds = new BasicDataSource();
        //设置驱动(Class.forName())
        ds.setDriverClassName(prop.getProperty("driver"));
		//设置url 
        ds.setUrl(prop.getProperty("url"));
        //设置数据库用户名
        ds.setUsername(prop.getProperty("user"));
        //设置数据库密码
        ds.setPassword(prop.getProperty("pwd"));
        //初始连接数量
        ds.setInitialSize(Integer.parseInt(prop.getProperty("initsize")));
        //连接池允许的最大连接数
        ds.setMaxActive(Integer.parseInt(prop.getProperty("maxactive")));
        //设置最大等待时间
        ds.setMaxWait(Integer.parseInt(prop.getProperty("maxwait")));
		//设置最小空闲数
        ds.setMinIdle(Integer.parseInt(prop.getProperty("minidle")));
		//设置最大空闲数
        ds.setMaxIdle(Integer.parseInt(prop.getProperty("maxidle")));
        //初始化线程本地
        tl = new ThreadLocal<Connection>();
        
	  }catch(Exception e){
	      e.printStackTrace();	  
	  }
  }
  /**
   * 获取数据库连接
   * @return
   * @throws SQLException
   */
  public static Connection getConnection() throws SQLException{
	  /*
	   * 通过连接池获取一个空闲连接
	   */
	  Connection conn = ds.getConnection();
	  tl.set(conn);
	  return conn;
  }
  /**
   * 关闭数据库连接
   */
  public static void closeConnection(){
	  try{
		  Connection conn = tl.get();
		  if(conn != null){
			  //恢复连接为自动提交事务
			  conn.setAutoCommit(true);
			  /*
			   * 通过连接池获取的Connection的close()方法实际上并没有将连接关闭，而是将该连接归还。
			   */
			  conn.close();
			  tl.remove();
		  }
	  }catch(Exception e){
		  e.printStackTrace();
	  }
  }
}
