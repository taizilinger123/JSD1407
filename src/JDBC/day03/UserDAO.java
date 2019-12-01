package JDBC.day03;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.sql.Statement;
import java.util.ArrayList;
import JDBC.day01.DBUtil2;

/**
 * UserDAO
 * 用于操作数据库User表的DAO
 * @author sige
 *
 */
public class UserDAO {
  private static final String FIND_BY_ID_SQL="SELECT * FROM user_sige WHERE id=?";
  private static final String FIND_ALL = "SELECT * FROM user_sige";
  private static final String SAVE_USER="INSERT INTO user_sige VALUES(user_seq_sige.NEXTVAL,?,?,?,?,?)";
  /**
   * 根据ID查询对应的user记录
   * @param id
   * @return
   */
  public User findById(int id){
		try{
			Connection conn = DBUtil2.getConnection();
			PreparedStatement ps = conn.prepareStatement(FIND_BY_ID_SQL);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				int i = rs.getInt("id");
				String name = rs.getString("name");
				String pwd = rs.getString("password");
				int money = rs.getInt("money");
				String email = rs.getString("email");
				int deptno = rs.getInt("deptno");
				User user = new User(i,name,pwd,money,email,deptno);
				return user;
			}	
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil2.closeConnection();
		}
	  return null;
  }
  /**
   * 查询所有的user记录
   * @return
   */
  public List<User> findAll(){
		try{
			Connection conn = DBUtil2.getConnection();
			Statement state = conn.createStatement();		
			ResultSet rs = state.executeQuery(FIND_ALL);		
			List<User> users = new ArrayList<User>();
			while(rs.next()){
				int i = rs.getInt("id");
				String name = rs.getString("name");
				String pwd = rs.getString("password");
				int money = rs.getInt("money");
				String email = rs.getString("email");
				int deptno = rs.getInt("deptno");
				User user = new User(i,name,pwd,money,email,deptno);
				users.add(user);
			}
			state.close();
			return users;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil2.closeConnection();
		}
	  return null;
  }
  /**
   * 保存一个user信息
   * @param user
   * @return
   */
  public boolean save(User user){
		try{
			Connection conn = DBUtil2.getConnection();
			PreparedStatement ps = conn.prepareStatement(SAVE_USER,new String[]{"id"});
			ps.setString(1, user.getName());
			ps.setString(2, user.getPassword());
			ps.setInt(3, user.getMoney());
			ps.setString(4, user.getEmail());
			ps.setInt(5, user.getDeptno());
			if(ps.executeUpdate()>0){
				ResultSet rs = ps.getGeneratedKeys();
				rs.next();
				int id = rs.getInt(1);
				user.setId(id);
				ps.close();
				return true;
			}
			ps.close();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil2.closeConnection();
		}
	  return false;
  }
  /**
   * 更新一个user信息
   * @return
   */
  public boolean update(User user){
		/*
		 * UPDATE user_fanchuanqi
		 * SET name=?,password=?,.....
		 * WHERE id=?
		 */
		return false;
	}
	/**
	 * 根据id删除一个user信息
	 * @param id
	 * @return
	 */
	public boolean deleteById(int id){
		/*
		 * DELETE FROM user_fanchuanqi
		 * WHERE id=?
		 */
		return false;
	}
}
