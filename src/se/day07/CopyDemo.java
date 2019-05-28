package se.day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件的字节输入输出流实现文件的复制
 * @author sige
 *
 */
public class CopyDemo {
   public static void main(String[] args) throws IOException{
	   FileInputStream fis = new FileInputStream("src.jpg");
	   FileOutputStream fos = new FileOutputStream("copy2.jpg");
	   byte[] buf = new byte[10240];
	   int len = -1;
	   while((len=fis.read(buf))!=-1){
		   fos.write(buf,0,len);
	   }
	   System.out.println("复制完毕");
	   fis.close();
	   fos.close();
   }
}
