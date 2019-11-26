package JDBC.day01;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 通过DBUtil获取连接，并执行sql
 * @author sige
 *
 */
public class JDBCDemo3 {
  public static void main(String[] args) {
	try {
		Thread t = Thread.currentThread();
		System.out.println("执行main方法的线程是:"+t);
		
		Connection conn = DBUtil.getConnection();
		System.out.println("数据库已连接");
		
		Statement state = conn.createStatement();
		String sql = "SELECT * FROM emp";
		//执行sql,得到结果集
		ResultSet rs = state.executeQuery(sql);
		
		while(rs.next()){
        	int empno = rs.getInt("empno");
        	String ename = rs.getString("ename");
        	int sal = rs.getInt("sal");
        	int deptno = rs.getInt("deptno");
        	System.out.println(empno+","+ename+","+sal+","+deptno);
		}
		/*
		 * 结果集使用完毕后就应当关闭，释放资源。
		 * 但是若Statement关闭了，那么rs也会自动关闭。
		 */
		rs.close();
		/*
		 * 当 不再通过Statement执行其他sql时，我们应当及时关闭Statement以释放JDBC与数据库的资源占用。
		 */
		state.close();
		//使用后关闭连接
		DBUtil.closeConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
