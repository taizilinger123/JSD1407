package se.day05;

import java.io.File;

/**
 * 创建多级目录
 * @author sige
 *
 */
public class FileDemo6 {
  public static void main(String[] args) {
	  /*
	   * 在当前目录下创建
	   * a/b/c/d/e/f/g/h/i/j/k
	   */
	  File dir = new File("a/b/c/d/e/f/g/h/i/j/k");
	  if(!dir.exists()){
		  /*
		   * mkdirs方法在创建当前目录时，会自动
		   * 创建所有不存在的父目录
		   */
		  dir.mkdirs();
		  System.out.println("创建目录成功");
	  }
  }
}
