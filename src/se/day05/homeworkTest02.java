package se.day05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 统计一个字符串每个字符串出现的次数
 * @author sige
 *
 */
public class homeworkTest02 {
   public static void main(String[] args) {
	  String str = "good good study,day day up";
	  /*
	   * 1:创建一个map
	   *   key:出现的字符
	   *   value:字符出现的次数
	   * 2:获取字符串中每一个字符
	   * 3:查看字符是否在Map中作为key存在
	   *   存在:存在说明以前统计过了，只需要对value+1
	   *   不存在:说明没统计过，value设置为1
	   */
	  //1
	  Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
	  //2
	  for(int i=0;i<str.length();i++){
		  char c = str.charAt(i);
		  //3
		  if(map.containsKey(c)){
			  //统计过,value+1
			  map.put(c, map.get(c)+1);
		  }else{
			  //没统计过
			  map.put(c, 1);
		  }
	  }
	  System.out.println(map);
	  /*
	   * test06
	   * 遍历所有的字符
	   */
	  Set<Character> keyset = map.keySet();
	  for(Character c : keyset){
		  System.out.println("key:"+c);
	  }
	  
	  Set<Entry<Character, Integer>> entrySet = map.entrySet();
	  for(Entry<Character, Integer> e:entrySet){
		  System.out.println(e.getKey()+"="+e.getValue());
	  }
	  
   }
}
