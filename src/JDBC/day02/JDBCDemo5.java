package JDBC.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import JDBC.day01.DBUtil2;

/**
 * 使用预编译SQL提高执行效率
 * @author sige
 *
 */
public class JDBCDemo5 {
  public static void main(String[] args) {
	try {
		Connection conn = DBUtil2.getConnection(); 
		conn.setAutoCommit(false);
		//Statement state = conn.createStatement();
		String sql = "INSERT INTO user_sige " +
                     "VALUES(?,?,'123456',?,?)";
		/*
		 * 根据给定的预编译SQL语句创建一个PreparedStatement
		 */
		PreparedStatement ps = conn.prepareStatement(sql);
		
		long start = System.currentTimeMillis();
		for(int i=2000;i<3000;i++){
			ps.setInt(1, i);
			ps.setString(2, "test"+i);
			ps.setInt(3, 5000);
			ps.setString(4, "test"+i+"@qq.com");
			ps.executeUpdate();
		}
		conn.commit();
		
//		for(int i=3000;i<4000;i++){
//			String sql = "INSERT INTO user_sige " +
//		                 "VALUES" +
//					     "("+i+"," + 
//		                 "'test"+i+"'," +
//					     "'12345'," + 
//		                 "5000," + 
//					     "'test"+i+"@qq.com'" +
//		                 ")";
//			//System.out.println(sql);//打桩排错
//			state.executeUpdate(sql);
//		}
		
		System.out.println("插入完毕");
		long end = System.currentTimeMillis();
		System.out.println("耗时:"+(end-start));
	} catch (Exception e) {
	     e.printStackTrace();
	}finally {
		DBUtil2.closeConnection();
	}
  }
}
