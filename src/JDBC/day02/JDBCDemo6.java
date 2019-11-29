package JDBC.day02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import JDBC.day01.DBUtil2;

/**
 * ResultSet查询结果集
 * @author sige
 *
 */
public class JDBCDemo6 {
  public static void main(String[] args) {
	try {
		Connection conn = DBUtil2.getConnection();
		Statement state = conn.createStatement(
				           ResultSet.TYPE_SCROLL_INSENSITIVE,
				           ResultSet.CONCUR_UPDATABLE
				);
		String sql = "SELECT empno,ename,sal,deptno FROM emp_sige1";
		//System.out.println(sql);//java.sql.SQLSyntaxErrorException: ORA-00904: "SALARY": 标识符无效1.可能是sql语句不对2.可能是字段名不对
		ResultSet rs=state.executeQuery(sql);
		while(rs.next()){
			String ename =rs.getString("ename");
			int sal = rs.getInt("sal");
			System.out.println(ename+":"+sal);
			rs.updateInt("sal", 998);//把sal列全部改为998了
			rs.updateRow();
//			/*
//			 * 不推荐，因为可读性差
//			 * 参数表示结果集中第几个字段
//			 */
//			int empno = rs.getInt(1);//数据库里都是从1开始，java代码里都是从0开始
//			String ename = rs.getString(2);
//			int sal = rs.getInt(3);
//			int deptno = rs.getInt(4);
//			System.out.println(empno+","+ename+","+sal+","+deptno);
		}	
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBUtil2.closeConnection();
	}
  }
}
