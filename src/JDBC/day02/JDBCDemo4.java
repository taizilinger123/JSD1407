package JDBC.day02;

import java.sql.Statement;
import java.sql.Connection;
import JDBC.day01.DBUtil2;

/**
 * 创建表  user
 * 字段：
 * id          NUMBER(4)
 * name        VARCHAR2(30)
 * password    VARCHAR2(30)
 * money       NUMBER(10)
 * email       VARCHAR2(60)
 * @author sige
 *
 */
public class JDBCDemo4 {
  public static void main(String[] args) {
	 try {
		/*
		 * CREATE TABLE user(
		 * id NUMBER(4),
		 * name VARCHAR2(30),
         * password VARCHAR2(30),
         * money    NUMBER(6),
         * email    VARCHAR2(60)
		 * 
		 * )
		 */
		 String sql  =  "CREATE TABLE user_sige( "+
		                " id NUMBER(4)," +
				        " name VARCHAR2(30)," +
		                " password VARCHAR2(30)," +
				        " money    NUMBER(6)," +
		                " email    VARCHAR2(60)" +
				        ")";
		 Connection conn = DBUtil2.getConnection();
		 Statement state = conn.createStatement();
		 /*
		  * 使用execute(String sql)执行DDL
		  * execute方法可以执行任何sql语句
		  * 返回值为true:说明执行的是查询语句，并返回了结果集
		  * 通常我们使用它来执行DDL
		  */
		 boolean b = state.execute(sql);
		 if(!b){
			 System.out.println("表创建成功");
		 } 
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBUtil2.closeConnection();
	}
  }
}
