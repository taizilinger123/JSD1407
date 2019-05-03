package se.day06;

import java.io.File;

/**
 * 获取一个目录下的所有子项
 * @author sige
 *
 */
public class FileDemo {
   public static void main(String[] args) {
	 /*
	  * 查看当前项目根目录下的所有子项
	  */
	 File dir = new File(".");
	 //首先判断是否为一个目录
	 if(dir.isDirectory()){
		 //获取当前目录下的所有子项
		 File[] subs = dir.listFiles();
		 for(File sub : subs){
			 String name = sub.getName();
			 //目录是没有长度的
			 long length = sub.length();
			 System.out.println(name+":"+length);
		 }	 
	 }
   }
   /*
    * 删除给定的文件或目录(目录可能是多级的)
    * 递归?
    * 编写代码，代码不超过20行
    * 循环输出 1+2+3...+100
    * 每加一次，输出一次结果
    * 最终输出5050
    * 该程序中不得出现for while等关键字
    */
}
