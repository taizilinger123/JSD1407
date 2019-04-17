package se.day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为List集合
 * 不能转换为Set集合，原因在于Set集合不能存放重复元素
 * @author sige
 *
 */
public class ToListDemo {
  public static void main(String[] args) {
	String[] array = {"1","2","3","4","5"};
	/*
	 * 通过Arrays转换的集合是不能添加新元素的
	 */
	List<String> list = Arrays.asList(array);
	System.out.println(list);
	/*
	 * 所有的集合(包括Set集合)都支持一个
	 * 构造方法，参数传入一个Collection
	 * 这个构造方法的好处是，在创建当前集合时
	 * 默认就包含给定集合中的所有元素
	 */
	List<String> list2 = new ArrayList<String>(list);
//	list2.addAll(list);
	list2.add("6");
	System.out.println(list2);
  }
}
