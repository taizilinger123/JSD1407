package se.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合，通常是有序集
 * 特点是可以根据下标操作元素
 * @author sige
 *
 */
public class ListDemo {
    public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * T get(int index)
		 * 获取给定下标所对应的元素
		 */
		String str = list.get(2);
		System.out.println(str);
		/*
		 * List集合可以通过下标遍历集合每个元素
		 */
		for(int i=0;i<list.size();i++){
			str = list.get(i);
			System.out.println(str);
		}
		/*
		 * T set(int index, T t)
		 * 将给定的元素设置到给定的位置上
		 * 返回值为原位置上的元素
		 * 所以该方法是替换元素操作
		 */
		System.out.println(list);
		String old = list.set(1, "2");
		System.out.println(list);
		System.out.println("被替换的元素:"+old);
	}
}
