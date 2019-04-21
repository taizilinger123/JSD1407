package se.day05;

import java.util.HashMap;
import java.util.Map;

/**
 * Map
 * 该数据结构看起来更像是一个多行两列的表格
 * 每一条数据中包含两个信息key-value
 * 其中key在Map中不允许重复，重复指的是equals为true
 * @author sige
 *
 */
public class MapDemo {
  public static void main(String[] args) {
	/*
	 * 创建一个Map
	 * key是字符串，value是整数
	 */
	Map<String,Integer> map = new HashMap<String,Integer>();
	/*
	 * V put(K k,V v)
	 * 将给定的key与对应的value存入Map中
	 * 若给定的key在Map中不存在，则是添加新内容
	 * 那么返回值就是null
	 * 若给定的key在Map中已存在，则是替换value操作
	 * 那么返回的就是被替换的value值
	 * 
	 */
	System.out.println(map);
	map.put("数学", 90);
	map.put("语文", 98);
	map.put("物理", 85);
	map.put("化学", 78);
	map.put("英语", 92);
	map.put("体育", 65);
	map.put("体育", 78);
	System.out.println(map);
	
	
//	System.out.println(map);
//	Integer i = map.put("数学",90);
//	System.out.println(map);
//	System.out.println(i);
//	i = map.put("数学",99);
//	System.out.println(map);
//	System.out.println(i);
	/*
	 * V get(K k)
	 * 根据给定的key获取对应的value
	 */
	Integer num = map.get("英语");
	System.out.println("英语:"+num);
	/*
	 * 给定一个Map中不存在的key返回值则为null
	 */
	num = map.get("高数");
	System.out.println("高数:"+num);
	
  }
}
