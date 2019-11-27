package JDBC.day02;

import java.sql.Connection;
import java.sql.Statement;
import JDBC.day01.DBUtil2;

/**
 * 修改记录
 * @author sige
 *
 */
public class JDBCDemo2 {
  public static void main(String[] args) {
	 try {
			Connection conn = DBUtil2.getConnection();
			Statement state = conn.createStatement();
			/*
			 * UPDATE emp 
			 * SET ename='rose'
			 * WHERE empno=8000
			 */
			String sql = "UPDATE emp "+
			             "SET ename='rose' "+
					     "WHERE empno=8000";
			int flag = state.executeUpdate(sql);
			if(flag>0){
				System.out.println("更新成功");
			}else{
				System.out.println("更新失败");
			}
			
			DBUtil2.closeConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
