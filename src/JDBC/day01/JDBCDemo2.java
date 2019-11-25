package JDBC.day01;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 测试配置文件的读取
 * config.properties
 * @author sige
 */
public class JDBCDemo2 {
  public static void main(String[] args) {
	 try {
	   /*java.util.Properties
	    * Properties类用于读取properties文件
	    * 使用该类可以以类似Map的形式读取配置文件中
	    * 的内容
	    * 
	    * properties文件中的内容格式类似：
	    * user=openlab
	    * 那么等号左面就是key,等号右面就是value
	    */
       Properties prop = new Properties();
	   /*
	    * 使用Properties去读取配置文件	 
	    */
       FileInputStream fis = new FileInputStream("./src/JDBC/day01/config.properties");
       /*
        * 当通过Properties读取文件后，那么这个流依然保持打开状态，我们应当自行关闭。
        */
       prop.load(fis);
       fis.close();
       System.out.println("成功加载完毕配置文件");
       /*
        * 当加载完毕后，就可以根据文本文件中等号左面的内容(key)来获取等号右面的内容(value)了
        * 可以变相的把Properties看做是一个Map
        */
       String driver = prop.getProperty("driver").trim();
	   String url = prop.getProperty("url").trim();
	   String user = prop.getProperty("user").trim();
	   String pwd = prop.getProperty("pwd").trim();
	   System.out.println("driver:"+driver);
	   System.out.println("url:"+url);
	   System.out.println("user:"+user);
	   System.out.println("pwd:"+pwd);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
}
