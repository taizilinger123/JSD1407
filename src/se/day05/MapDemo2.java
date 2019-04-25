package se.day05;

import java.util.HashMap;
import java.util.Map;

/**
 * hashcode对Map操作的影响
 * @author sige
 *
 */
public class MapDemo2 {
  public static void main(String[] args) {
	Map<Point,Integer> map = new HashMap<Point,Integer>(16);
	
	Point p = new Point(1, 2);
	
	map.put(p, 100);
	
	boolean contains = map.containsKey(p);
	System.out.println("包含key:"+contains);
	System.out.println(map);
	
	Integer i = map.get(p);
	System.out.println(i);
	
	//内容变化了，hashCode值就会变化
	p.setX(2);
	
	i = map.get(p);
	System.out.println(i);//null
	contains = map.containsKey(p);
	System.out.println("包含key:"+contains);
	System.out.println(map);
	
	map.put(p, 200);
	System.out.println(map);
	
	Integer ii = map.remove(p);
	System.out.println("删除的是:"+ii);
	System.out.println(map);
	
	p.setX(1);
	ii = map.remove(p);
	System.out.println("删除的是:"+ii);
	System.out.println(map);
	/*
	 * 使用HashMap时应当注意：
	 * 作为key的对象有以下要求：
	 * 1：首先当key这个类重写了equals方法，那么重写
	 * hashcode的要求必须满足
	 * 2：作为key的对象若存入HashMap后，其会影响
	 * hashcode值的内容不要发生改变，否则可能会影响
	 * Map的操作
	 */
	
  }
}
