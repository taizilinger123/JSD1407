package JDBC.day03;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
	 System.out.print("5:查询    ");
	 System.out.println("6:转账    ");

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
	 case 6:
		 giveMoney(scanner);
		 break;
	 }
  }
  /**
   * 转账操作
   * @param scanner
   */
  public static void giveMoney(Scanner scanner){
	  /*
	   * 1：获取用户输入的信息
	   * 2：必要的验证，看看转出账户余额是否够
	   * --事务开始的地方
	   * 3：更新转出账户的余额
	   * 4：更新转入账户的余额
	   * --提交事务的地方
	   */
	  //1
	  System.out.println("现在是转账操作");
	  System.out.println("请输入您的账号");
	  String fromUser = scanner.nextLine().trim();
	  
	  System.out.println("请输入收款人的账号");
	  String toUser = scanner.nextLine().trim();
	  
	  System.out.println("请输入转出金额");
	  String money = scanner.nextLine().trim();
	  
	  //2
	  String countSql = "SELECT money "
	  		+ "FROM user_sige "
	  		+ "WHERE name='"+fromUser+"'";
      try{
		Connection conn = DBUtil2.getConnection();
		//关闭自动提交事务
		conn.setAutoCommit(false);
		Statement state = conn.createStatement();
		ResultSet rs = state.executeQuery(countSql);
		//判断是否查询出数据
		if(rs.next()){
			int count = rs.getInt(1);
			//判断余额是否足够
			if(count>=Integer.parseInt(money)){
				//执行转账操作
				//开始纳入事务控制，因为开始执行DML操作了
				String fromSql = "UPDATE user_sige "
						+ "SET money=money-"+money+" "+
						"WHERE name='"+fromUser+"'";
				//修改当前用户的余额
				if(state.executeUpdate(fromSql)>0){
					//修改收款人的余额
					String toSql = "UPDATE user_sige "
							+ "SET money=money+"+money+" "+
							"WHERE name='"+toUser+"'";
					if(state.executeUpdate(toSql)>0){
						System.out.println("转账成功");
						/*
						 * 两次更新账户操作均成功，我们才认为这次转账操作完毕。提交事务
						 */
						conn.commit();
					}else{
						System.out.println("转账失败:没有收款人"+toUser);
						/*
						 * 若第二次更新操作失败，那么整次操作就算操作失败。应该回滚事务。
						 */
						conn.rollback();
					}
				}
				
			}else{
				System.out.println("余额不足");
			}
		}else{
			System.out.println("没有该用户:"+fromUser);
		}
	  }catch(Exception e) {
			e.printStackTrace();
	  }finally{
			DBUtil2.closeConnection();
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
		String sql = "SELECT * FROM user_sige " +
				     "WHERE name=? AND password=?";
		PreparedStatement ps = conn.prepareStatement(sql);
	   ps.setString(1, user);
	   ps.setString(2, pwd);
	   ResultSet rs = ps.executeQuery();
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
