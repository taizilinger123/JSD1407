package se.day05;

import java.io.File;

/**
 * 删除一个文件
 * @author sige
 *
 */
public class FileDemo3 {
   public static void main(String[] args) {
	  /*
	   * 删除当前目录下的test.txt文件
	   */
	   File file = new File("test.txt");
	   if(file.exists()){
		   file.delete();
		   System.out.println("删除成功");
	   }
   }
}
