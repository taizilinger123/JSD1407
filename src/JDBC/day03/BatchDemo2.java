package JDBC.day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import JDBC.day01.DBUtil2;

/**
 * 使用PreparedStatement执行批处理
 * @author sige
 *
 */
public class BatchDemo2 {
  public static void main(String[] args) {
	try{
	    Connection  conn = DBUtil2.getConnection();
	    String sql = "INSERT INTO user_sige " +
	                 "(id,name) " +
	    		     "VALUES(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		for(int i=3000;i<4000;i++){
			ps.setInt(1, i);
			ps.setString(2, "test"+i);
			ps.addBatch();
		}
		ps.executeBatch();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		DBUtil2.closeConnection();
	}
  }
}
