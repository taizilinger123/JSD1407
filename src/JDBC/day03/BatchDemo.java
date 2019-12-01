package JDBC.day03;

import java.sql.Connection;
import java.sql.Statement;
import JDBC.day01.DBUtil2;
/**
 * 使用批处理批量更新数据
 * @author Administrator
 *
 */


public class BatchDemo {
	public static void main(String[] args) {
		try{
			Connection conn
				= DBUtil2.getConnection();
			Statement state
				= conn.createStatement();
			
			for(int i=1000;i<20000;i++){
				String sql 
					="INSERT INTO user_sige " +
					 "(id,name) " +
					 "VALUES" +
					 "("+i+",'test"+i+"')";
				
	//			state.executeUpdate(sql);
				//缓存，等待一起执行
				state.addBatch(sql);
				if(i%500==0){
					state.executeBatch();
					state.clearBatch();
				}		
			}
			state.executeBatch();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			DBUtil2.closeConnection();
		}
	}
}
