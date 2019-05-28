package se.day08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter
 * 字符输出流，以字符为单位写出数据
 * 
 * 字符流只用于读写字符数据
 * @author sige
 *
 */
public class OSWDemo {
   public static void main(String[] args) throws IOException {
	  /*
	   * 向文件中写出文本数据(写字符串)
	   * 1:向文件中写数据(FileOutputStream)
	   * 2:写的是文本数据()
	   */
	   FileOutputStream  fos = new FileOutputStream("osw.txt");
	   /*
	    * OutputStreamWriter的特点是可以将
	    * 给定的字符串按照特定的字符集转换为字节后写出
	    * 使用构造方法:
	    * OutputStreamWriter(OutputStream out,String charsetName);
	    */
	   OutputStreamWriter  osw = new OutputStreamWriter(fos,"UTF-8");
	   //这样就可以直接写字符串了
	   osw.write("大家好才是真的好");
	   osw.write("呵呵");
//	   fos.write("大家好才是真的好".getBytes());
//	   fos.write("呵呵".getBytes());
	   osw.close();
	   
	   
   }
}
