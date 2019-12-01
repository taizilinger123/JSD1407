package JDBC.day03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import JDBC.day01.DBUtil2;

/**
 * 向dept表中追加一个新的部门
 * 同时向该部门添加一个用户
 * @author sige
 *
 */
public class JDBCDemo1 {
  public static void main(String[] args) {
	/*
	 * 1:先插入一个新的部门记录
	 * 2:再向user表中插入一个员工信息但同时该员工的部门编号应该是新插入的部门记录的主键值
	 */
	 try{
		Connection conn = DBUtil2.getConnection();
		Statement state = conn.createStatement();
		/*
		 * 先插入一个部门
		 */
		String deptSql = "INSERT INTO dept " +
				         "VALUES(dept_seq_sige.NEXTVAL," +
				         "'JAVA','SHANGHAI')";
		state.executeUpdate(deptSql);
		/*
		 * 获取刚刚插入的部门记录的主键值用于作为user表中新记录外键的值
		 */
		String idSql = "SELECT MAX(deptno) FROM dept";
		ResultSet rs = state.executeQuery(idSql);
		int id = 0;//新插入的部门id
		if(rs.next()){
			id = rs.getInt(1);
		}
		rs.close();
		/*
		 * 添加新user
		 */
		String userSql = "INSERT INTO user_sige " +
		                 "(id,name,deptno) " +
				         "VALUES(user_seq_sige.NEXTVAL," +
		                  "'JACKSON'," + id +
		                  ")";
		state.executeUpdate(userSql);
		System.out.println("保存完毕");
		/*
		 * 当Statement使用完毕后，也应当关闭。
		 */
		state.close();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		DBUtil2.closeConnection();
	}
  }
}
