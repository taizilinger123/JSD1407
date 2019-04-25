package se.day05;

import java.io.File;

/**
 * 使用File创建一个目录
 * @author sige
 *
 */
public class FileDemo4 {
  public static void main(String[] args) {
	 /*
	  * 在当前目录下创建一个目录demo
	  */
	  File dir = new File("demo");
	  if(!dir.exists()){
		  dir.mkdir();
		  System.out.println("创建目录成功");
	  }
  }
}
