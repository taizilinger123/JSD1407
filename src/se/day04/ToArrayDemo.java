package se.day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection中定义了两个方法
 * Object[] toArray()
 * <T>T[] toArray(T[] array)
 * @author sige
 *
 */
public class ToArrayDemo {
  public static void main(String[] args) {
	Collection<String> c = new ArrayList<String>();
	c.add("one");
	c.add("two");
	c.add("three");
    
//	Object[] array = c.toArray();
	/*
	 * 传入的数组长度有区别
	 * 若给定的数组长度不足以保存集合中所有元素时
	 * 集合子集创建一个同类型数组
	 * 若长度够，则使用我们给定的数组
	 */
//	String[] array = c.toArray(new String[c.size()]);
//	String[] array = c.toArray(new String[0]);
	String[] array = c.toArray(new String[10]);
	for(String str:array){
		System.out.println(str);
	}
 	
  }
}
