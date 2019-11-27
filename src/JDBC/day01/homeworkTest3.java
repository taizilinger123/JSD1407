package JDBC.day01;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 查询dept表中的数据并显示
 * @author sige
 *
 */
public class homeworkTest3 {
   public static void main(String[] args) {
	 try {
		 Connection conn = DBUtil2.getConnection();
		 Statement state = conn.createStatement();
		 String sql = "SELECT * FROM dept";
		 ResultSet rs = state.executeQuery(sql);
		 while(rs.next()){
			 int deptno = rs.getInt("deptno");
			 String dname = rs.getString("dname");
			 String loc = rs.getString("loc");
			 System.out.println(deptno+","+dname+","+loc);
		 }	
		 DBUtil2.closeConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
   }
}
