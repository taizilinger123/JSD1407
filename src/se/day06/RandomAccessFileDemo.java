package se.day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile用于读写文件数据的类
 * @author sige
 *
 */
public class RandomAccessFileDemo {
  public static void main(String[] args) throws IOException {
	/*
	 * 对项目根目录下一个名为demo.dat
	 * 的文件内容进行读写
	 */
	  RandomAccessFile raf = new RandomAccessFile("demo.dat","rw");
//      File file = new File("demo.dat");
//      RandomAccessFile raf2 = new RandomAccessFile(file,"rw");
	  /*
	   * void write(int n)
	   * 写出给定int值的"低8位"
	   * 只写1个字节
	   * 00000000 00000000 00000000 00000001
	   * 
	   * 1:不知道我不知道
	   * 2:知道了我不知道
	   * 3:知道了我知道的
	   * 4:不知道我知道的
	   */
//	  int num = -10;
//	  System.out.println(Integer.toBinaryString(num));
	  raf.write(1);
	  raf.write(97);
	  raf.write(-1);
	  /*
	   * 使用IO后，一定要记得关闭
	   */
	  raf.close();
  }
}
