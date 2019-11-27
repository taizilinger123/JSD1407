package JDBC.day02;

import java.sql.Connection;
import java.sql.Statement;
import JDBC.day01.DBUtil2;

/**
 * 删除工号为8000的员工
 * @author sige
 *
 */
public class JDBCDemo3 {
  public static void main(String[] args) {
		 try {
				Connection conn = DBUtil2.getConnection();
				Statement state = conn.createStatement();
				String sql = "DELETE FROM emp "+
				             "WHERE empno=8000";
				 if(state.executeUpdate(sql)>0){
					System.out.println("删除成功");
				}else{
					System.out.println("删除失败");
				}
				
				DBUtil2.closeConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
  }
}
