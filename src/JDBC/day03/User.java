package JDBC.day03;
/**
 * 实体类
 * 用于表示数据库中user表
 * @author sige
 *
 */
public class User {
	private int id;
	private String name;
	private String password;
	private int money;
	private String email;
	private int deptno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public User(){
		
	}
	public User(int id, String name, String password, int money, String email, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.money = money;
		this.email = email;
		this.deptno = deptno;
	}
	
}
