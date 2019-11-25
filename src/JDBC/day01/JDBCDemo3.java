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
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
