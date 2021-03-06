package JDBC.day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import JDBC.day01.DBUtil2;

/**
 * 分页机制
 * @author sige
 *
 */
public class PageDemo {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入要查看的表名");
	String tableName = scanner.nextLine().trim();
	System.out.println("请输入排序的列名");
	String colName = scanner.nextLine().trim();
	System.out.println("请输入一页显示的条数");
	int pageSize = Integer.parseInt(scanner.nextLine().trim());
	System.out.println("请输入查看的页数");
	int page = Integer.parseInt(scanner.nextLine().trim());
	try {
		Connection conn = DBUtil2.getConnection();
		/*
		 * SELECT * FROM (
		 *   SELECT ROWNUM rn,t.* FROM(
		 *      SELECT * FROM t ORDER BY c 
		 *   )  t
		 * )
		 * WHERE rn BETWEEN ? AND ?
		 */
		String sql = "SELECT * FROM ( " +
		             "SELECT ROWNUM rn,t.* FROM( " +
				     "SELECT * FROM "+tableName+" " +
				     "ORDER BY "+colName+"  " +
		             ")  t " +
				     ") " +
		             "WHERE rn BETWEEN ? AND ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		int start = (page-1)*pageSize+1;
		int end = page*pageSize;
	    ps.setInt(1, start);
	    ps.setInt(2, end);
	    ResultSet rs = ps.executeQuery();
	    while(rs.next()){
	    	int rw = rs.getInt(1);
	    	int id = rs.getInt(2);
	    	String name = rs.getString(3);
	    	System.out.println(rw+":"+id+":"+name);
	    }
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBUtil2.closeConnection();
	}
  }
}
