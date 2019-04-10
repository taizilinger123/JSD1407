package se.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {
  public static void main(String[] args) {
	  Collection c = new ArrayList();
		 c.add("one");
		 c.add("#");
		 c.add("two");
		 c.add("#");
//		 c.add(null);
		 c.add("three");
		 c.add("#");
		 c.add("four");
		 System.out.println(c);
		 
		 Iterator it = c.iterator();
		 while(it.hasNext()){
			 String str = (String)it.next();
			 /*
			  *尽量使用字面量.equals(变量)
			  *这样可以避免空指针异常的产生
			  */
			 if("#".equals(str)){
				 /*
				  * 在使用迭代器遍历集合的过程中
				  * 不可以通过集合的相关方法改变
				  * 集合元素
				  */
//				 c.remove(str);
				 /*
				  * 迭代器的remove方法用来从集合中
				  * 删除刚刚next()出来的元素
				  */
				 it.remove();
			 }			
		 }
		 System.out.println(c);
	  
  }
}
