package JDBC.day02;

import java.sql.Statement;
import java.sql.Connection;
import JDBC.day01.DBUtil2;

/**
 * 使用Statement执行DML操作
 * @author sige
 *
 */
public class JDBCDemo1 {
  public static void main(String[] args) {
	try {
		Connection conn = DBUtil2.getConnection();
		Statement state = conn.createStatement();
		/*
		 * INSERT INTO emp(empno,ename,job,sal,deptno)
		 * VALUES(8000,'JACK','MANAGER',5000,30)
		 * 
		 * 
		 */
		String sql = "INSERT INTO emp "+
		             "(empno,ename,job,sal,deptno) "+
				     " VALUES "+
		             "(8000,'JACK','MANAGER',5000,30)";
		System.out.println(sql);
		//执行DML操作
		int flag = state.executeUpdate(sql);
		if(flag>0){
			System.out.println("插入成功");
		}else{
			System.out.println("插入失败");
		}
		DBUtil2.closeConnection();
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
