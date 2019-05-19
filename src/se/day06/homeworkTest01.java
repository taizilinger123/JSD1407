package se.day06;

import java.io.File;

/**
 * 删除给定的文件或目录
 * @author sige
 *
 */
public class homeworkTest01 {
  public static void main(String[] args) {
	  File file = new File("aa");
	  deleteFile(file);
  }
  /**
   * 给定一个File对象，然后将其删除
   * @param file
   */
  public static void deleteFile(File file){
	  if(file.isDirectory()){
		  //如果是目录，还要看是否有子项
		  File[] subs = file.listFiles();
		  //先删除所有子项
		  for(File sub : subs){
			  deleteFile(sub);
		  }
	  }
	  file.delete();
  }
}
