package se.day06;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RandomAccessFile完成复制操作
 * @author sige
 *
 */
public class RandomAccessFileDemo3 {
  public static void main(String[] args) throws IOException{
     /*
      * 1:创建一个RandomAccessFile用于读取
      *   待复制的文件
      * 2:创建一个RandomAccessFile用于将
      *   原文件的中数据写入该文件
      * 3:循环从原文件中读取每一个字节并写入目标文件中
      * 4:关闭两个RandomAccessFile
      */
	  //1
	  RandomAccessFile src = new RandomAccessFile("src.jpg","r");
	  //2
	  RandomAccessFile des = new RandomAccessFile("copy.jpg","rw");
	  //3
	  int d = -1;
	  while((d = src.read()) != -1){
		  des.write(d);
	  }
	  
	  //4
	  System.out.println("拷贝完毕");
	  src.close();
	  des.close(); 
  }
}
