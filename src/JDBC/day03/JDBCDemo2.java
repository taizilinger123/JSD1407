package JDBC.day03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBC.day01.DBUtil2;

/**
 * PreparedStatement支持一个方法
 * 可以在执行插入操作后，获取该条语句在数据库表中产生的记录中每个字段的值
 * 有了这个功能，我们在向从表中插入数据时可以获取该主键作为外键插入。而无需
 * 因为要获取主表中主键的值而进行一次查询。
 * @author sige
 *
 */
public class JDBCDemo2 {
  public static void main(String[] args) {
	try {
		Connection  conn = DBUtil2.getConnection();
		String sql = "INSERT INTO dept " +
				         "VALUES(dept_seq_sige.NEXTVAL," +
				         "?,?)";
		/*
		 * 创建PreparedStatement时，可以使用Connection的重载方法，第二个参数
		 * 要求我们传入一个字符串数组，用来指定当通过ps执行插入操作后，该记录在表中想获取的值所在的字段名。
		 */
		PreparedStatement state = conn.prepareStatement(sql,new String[]{"deptno","dname"});
		state.setString(1, "ORACLE");
		state.setString(2, "NANJING");
		if(state.executeUpdate()>0){
			/*
			 * 获取刚刚插入进去的记录中关注的那几列的值
			 */
		    ResultSet rs = state.getGeneratedKeys();
		    if(rs.next()){
		    	//获取deptno的值
		    	int deptno = rs.getInt(1);
		    	System.out.println("该部门编号:"+deptno);
		    }
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBUtil2.closeConnection();
	}
  }
}
