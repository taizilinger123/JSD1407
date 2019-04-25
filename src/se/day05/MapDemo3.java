package se.day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map的三种方式
 * 1:遍历所有的key
 * 2:遍历所有的键值对(key-value)
 * 3:遍历所有的value(不常用) 
 * @author sige
 *
 */
public class MapDemo3 {
  public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<String,Integer>();//无序
//	Map<String,Integer> map = new LinkedHashMap<String,Integer>();//有序
		map.put("数学", 90);
		map.put("语文", 98);
		map.put("物理", 85);
		map.put("化学", 78);
		map.put("英语", 92);
		map.put("体育", 65);
		map.put("生物", 78);
		
		/*
		 * 遍历所有的key
		 * Set<K> keySet()
		 * 该方法可以获取Map中所有的key,并将它们存
		 * 一个Set集合中返回
		 * 所以，遍历该集合就等于遍历所有的key了
		 */
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			System.out.println("key:"+key);
		}
		
		/*
		 * 遍历键值对
		 * Set<Entry> entrySet()
		 * 该方法会将每一组key-value存入一个Entry
		 * 实例中，并将这些Entry实例存入一个Set集合
		 * 并返回
		 * 我们只需要遍历该集合，拿到每一个Entry实例
		 * 并获取其中的key与value即可
		 */
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> e:entrySet){
			 String key = e.getKey();
			 Integer value = e.getValue();
			 System.out.println(key+":"+value);
		}
		/*
		 * 遍历所有的value
		 */
		Collection<Integer> values = map.values();
		for(Integer value : values){
			System.out.println("value:"+value);
		}
		
  }
}
