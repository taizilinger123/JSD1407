package JDBC.day03;

import java.util.List;

public class MyUserService {
  public static void main(String[] args) {
	 UserDAO dao = new UserDAO();
	 
	 User user = new User();
	 user.setName("marry");
	 user.setPassword("123456");
	 user.setMoney(5000);
	 user.setEmail("marry@qq.com");
	 user.setDeptno(30);
	 System.out.println("id:"+user.getId());
	 if(dao.save(user)){
		 System.out.println("注册成功");
		 System.out.println("您的id是:"+user.getId());
	 }
	 
//	 //User user = dao.findById(1);
//	 List<User> users = dao.findAll();
//	 for(User user : users){
//	    System.out.println("欢迎你:"+user.getName());
//	 }
  }
}
