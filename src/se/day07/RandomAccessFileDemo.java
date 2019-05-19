package se.day07;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 查看RandomAccessFile的指针位置
 * RAF总是根据当前指针所指向的位置进行读或者写操作，并且
 * 每次读写后，指针自动向后移动
 * @author sige
 *
 */
public class RandomAccessFileDemo {
   public static void main(String[] args) throws IOException {
	   RandomAccessFile raf = new RandomAccessFile("raf.dat","rw");
	   /*
	    * long getFilePointer()
	    * 获取当前RAF的指针位置
	    */
	   long p = raf.getFilePointer();
	   System.out.println(p);//0
	   raf.write(97);//写一个字节
	   System.out.println(raf.getFilePointer());//1
	   raf.writeInt(1);//连续写4个字节
	   System.out.println(raf.getFilePointer());//5
	   /*
	    * 若想从文件的某个地方读取字节
	    * 需要先将指针移动到这个位置
	    * void seek(long position)
	    */
	   raf.seek(0);
	   //通过raf读取一个字节
	   int n = raf.read();
	   System.out.println(n);
	   System.out.println(raf.getFilePointer());//1
	   raf.close();
   }
}
