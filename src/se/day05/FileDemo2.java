package se.day05;

import java.io.File;
import java.io.IOException;

/**
 * 使用File操作文件
 * 创建一个空文件
 * @author sige
 *
 */
public class FileDemo2 {
  public static void main(String[] args) throws IOException {
	 /*
	  * 在当前项目的根目录下创建一个文件
	  * test.txt
	  */
	  //表示当前目录，可以忽略"./"
	  File file = new File("test.txt");
	  if(!file.exists()){
		  file.createNewFile();
		  System.out.println("创建文件成功");
	  }
  }
}
