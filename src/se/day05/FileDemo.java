package se.day05;

import java.io.File;

/**
 * java.io.File
 * @author sige
 *
 */
public class FileDemo {
  public static void main(String[] args) {
	  /*
	   *File.separator表示不同系统的目录层级分隔符
	   *为了忽略平台差异性，我们在写路径时应当使用该常量。
	   */
	 File file = new File("."+File.separator+"demo.txt");
	 /*
	  * String getName()
	  * 获取File表示的文件或目录的名字
	  */
	 String fileName = file.getName();
	 System.out.println(fileName);
	 
	 /*
	  * boolean exists()
	  * 判断当前File所表示的文件或目录是否真实
	  * 存在
	  */
	 boolean exists = file.exists();
	 System.out.println("是否存在:"+exists);
	 /*
	  * long length()
	  * 获取当前File所表示的文件所占用的字节量
	  */
	 long length = file.length();
	 System.out.println("大小:"+length+"字节");
	 /*
	  * 查看当前File表示的文件是否具有
	  * 可读，可写，可运行权限
	  */
	 file.canRead();
	 file.canWrite();
	 file.canExecute();
	 /*
	  * 获取当前文件或目录的最后修改时间
	  */
	 long time = file.lastModified();
	 /*
	  * boolean isFile()
	  * 判断当前File对象表示的是否为一个文件
	  */
	 boolean isFile = file.isFile();
	 System.out.println("是文件:"+isFile);
  }
}
