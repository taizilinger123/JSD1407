package JDBC.day01;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * 测试使用JDBC连接oracle数据库
 * @author sige
 *
 */
public class JDBCDemo {
  public static void main(String[] args) {
	try {
		//加载驱动
		/*
		 * 当出现了:
		 * java.lang.ClassNotFoundException: 
		 * oracle.jdbc.driver.OracleDriver
		 * 这个异常时，说明数据库的驱动jar包没有导入到项目中。
		 * 若导入了jar包还报这个错误，大部分原因是书写的驱动有错误
		 * class.forName("com.mysql.jdbc.Driver");
		 */
		Class.forName("oracle.jdbc.driver.OracleDriver");
		/*
		 * 第二步：
		 * 通过DriverManager获取数据库连接
		 * 注意：
		 * 导入的包都在java.sql.*
		 * DriverManager连接ORACLE时的路径格式
		 * jdbc:oracle:thin:@<host>:<port>:<sid>
		 * 
		 * Mysql的路径  端口号通常是:3306
		 * jdbc:mysql://<host>:<port>/<dbname>
		 */
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl1","test","123456");
		/*
		 * 通过Connection创建Statement用来执行sql语句
		 * execute是用于执行DDl语句
		 * executeQuery用于执行DQL语句select语句
		 * executeUpdate用于执行DML增删改操作,返回的insert是影响数据库数据的
		 */
		Statement state = conn.createStatement();
		/*
		 * 通过Statement执行查询语句
		 * 查询emp表中的信息
		 * SELECT empno,ename,sal,deptno FROM emp;
		 */
		String sql = "SELECT empno,ename,sal,deptno "+ "FROM emp";
		
		//输出sql,用于检查拼写是否有错误
		System.out.println(sql);
		/*
		 * 使用executeQuery来执行DQL语句
		 * 并且查询后会得到一个查询结果集
		 */
		ResultSet rs = state.executeQuery(sql);
		/*
		 * 需要注意的是,Resultset表示的是查询结果集，但实际上查询的结果集
		 * 在ORACLE数据库服务器上，并没有全部保存在本地，所以，我们通过Resultset
		 * 的next方法获取下一条记录时，Resultset会发送请求至服务端获取数据，若连接已经
		 * 关闭，那么会抛出异常。
		 */
        while(rs.next()){
        	int empno = rs.getInt("empno");
        	String ename = rs.getString("ename");
        	int sal = rs.getInt("sal");
        	int deptno = rs.getInt("deptno");
        	System.out.println(empno+","+ename+","+sal+","+deptno);
        }
        //关闭连接
		conn.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
  }
}
