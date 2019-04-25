package se.day05;

import java.io.File;

/**
 * 删除一个目录
 * @author sige
 *
 */
public class FileDemo5 {
  public static void main(String[] args) {
	 /*
	  * 删除当前目录下的目录demo
	  */
	  File dir = new File("demo");
	  boolean isDir = dir.isDirectory();
	  System.out.println("是否为目录:"+isDir);
	  if(dir.exists()){
		  dir.delete();
		  System.out.println("删除目录成功");
	  }
  }
}
