package se.day07;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream
 * 节点流
 * 用于向文件中写出字节的流
 * @author sige
 *
 */
public class FosDemo {
  public static void main(String[] args) throws IOException {
	 FileOutputStream fos = new FileOutputStream("fos.dat");
	 fos.write(97);
	 
	 String str = "天安门上太阳升";
	 byte[] buf = str.getBytes("UTF-8");
	 fos.write(buf);
	 
//	 int i = Integer.MAX_VALUE;
//	 fos.write(i>>>24);
//	 fos.write(i>>>16);
//	 fos.write(i>>>8);
//	 fos.write(i);
	 
	 fos.close();
	 
	 
  }
}
