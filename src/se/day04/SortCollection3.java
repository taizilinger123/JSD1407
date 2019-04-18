package se.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollection3 {
   public static void main(String[] args) {
	  List<String> list = new ArrayList<String>();
	  list.add("张三");
      list.add("boss");
      list.add("苍#null");
	  list.add("小泽老师");
	  list.add("范老师");
	  
	  System.out.println(list);
	  Comparator<String> com = new MyComparator(); 
	  Collections.sort(list,com);
	  System.out.println(list);
   }
}
/**
 * 何时应该声明比较器
 * 当集合中的元素已经实现了Comparable接口，并且实现了
 * 比较规则，但是该比较规则不能满足我们对于排序的需求时
 * 我们可以额外的定义一个比较规则。
 * @author sige
 *
 */
class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}
