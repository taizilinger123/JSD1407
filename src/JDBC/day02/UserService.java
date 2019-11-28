package JDBC.day02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;
import JDBC.day01.DBUtil2;

/**
 * 与用户相关的业务逻辑
 * @author sige
 *
 */
public class UserService {
  public static void main(String[] args) {
	 /*
	  * 程序启动后：
	  * 选择1,2,3,4等操作
	  * 1：注册新用户        用户ID从1开始
	  * 2：更改用户信息
	  * 3：删除用户信息
	  * 4：查询用户信息
	  */
	 System.out.println("请输入选项:");
	 System.out.print("1:注册   ");
	 System.out.print("2:登录   ");
	 System.out.print("3:修改   ");
	 System.out.print("4:删除   ");
	 System.out.println("5:查询    ");

	 Scanner scanner = new Scanner(System.in);
	 int option = Integer.parseInt(scanner.nextLine().trim());
	 switch(option){
	 case 1:
		 //注册
		 regUser(scanner);
		 break;
	 case 2:
		 //登录
		 login(scanner);
		 break;
	 case 3:
		 break;
	 case 4:
		 break;
	 case 5:
		 break;
	 }
  }
  /**
   * 登录操作
   * @param scanner
   */
  public static void login(Scanner scanner){
	  /*
	   * 1:要求用输入用户名及密码
	   * 2:根据用户输入作为条件去表中查询
	   * 3:若查询出数据，说明输入正确
	   */
	  System.out.println("现在是登录操作");
	  System.out.println("请输入用户名:");
	  String user = scanner.nextLine().trim();
	  System.out.println("请输入密码:");
	  String pwd = scanner.nextLine().trim();
	  
	  try {
		Connection conn = DBUtil2.getConnection();
		Statement  state = conn.createStatement();
		String sql = "SELECT * " +
		             "FROM user_sige " +
				     "WHERE " +
				     "name='"+user+"' " +
				     "AND " +
				     "password='"+pwd+"'";
	   ResultSet rs = state.executeQuery(sql);
	   //根据用户输入的能否查到数据
	   if(rs.next()){
		   System.out.println("登陆成功!");
	   }else{
		   System.out.println("用户名或密码错误!");
	   }
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		DBUtil2.closeConnection();
	}
  }
  
  
  /**
   * 注册操作
   * @param scanner
   */
  public static void regUser(Scanner scanner){
	/*
	 * 若是注册操作：
	 * 1：获取用户输入的相关信息
	 * 2：获取连接
	 * 3：获取Statement 
	 * 4:先获取id的最大值
	 * 5:对该值+1，作为当前记录的主键值
	 * 6:插入记录
	 * 7:关闭连接
	 */
	  try {
		//1
		System.out.println("现在是注册操作:");
		System.out.println("请输入用户名:");
		String user = scanner.nextLine().trim();
		System.out.println("请输入密码:");
		String pwd = scanner.nextLine().trim();
		System.out.println("请输入账户金额:");
		String money = scanner.nextLine().trim();
		System.out.println("请输入邮箱:");
		String email = scanner.nextLine().trim();
		//2
		Connection conn = DBUtil2.getConnection();
		//3
		Statement state = conn.createStatement();
		//4
		String idSql = "SELECT MAX(id) id FROM user_sige";
		//5
		ResultSet rs = state.executeQuery(idSql);
		
		int id = -1;
		if(rs.next()){
			id = rs.getInt("id");
		}
		//统计出最大值后，对ID加1
		id++;
		rs.close();
		//6
		/*
		 * INSERT INTO user_sige  VALUES(1,'jack','1234',5000,'ss@aa.com');	
		 */
		String sql = "INSERT INTO user_sige " +
		             "VALUES" +
		             "("+id+"," +
		             "'"+user+"'," +
		             "'"+pwd+"'," +
		             ""+money+"," +
		             "'"+email+"'" +
		             ")";
		System.out.println(sql);
		if(state.executeUpdate(sql)>0){
			System.out.println("注册成功!欢迎你:"+user);
		}else{
			System.out.println("呵呵"); 
		}
		
		
		System.out.println("当前最大ID是:"+id);
		
		DBUtil2.closeConnection();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
