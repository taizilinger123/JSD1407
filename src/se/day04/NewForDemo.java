package se.day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 新循环，又名：增强for循环，for each
 * 从java1.5(5.0)后推出的新特性
 * 新循环不能代替传统循环的工作
 * 新循环只用来遍历集合或数组
 * @author sige
 *
 */
public class NewForDemo {
   public static void main(String[] args) {
	  Collection c = new ArrayList();
	  c.add("one");
	  c.add("#");
	  c.add("two");
	  c.add("#");
	  c.add("three");
	  c.add("#");
	  c.add("four");
	  /*
	   * 新循环并非新的语法，只是编译器在编译成
	   * class文件时，将新循环转换成了迭代器
	   * 所以，在新循环遍历集合时，不能通过集合
	   * 的方法改变集合元素
	   */
	  for(Object o : c){
		  String str = (String)o;
		  System.out.println(str);
	  }
	  System.out.println(c);
   }
}
