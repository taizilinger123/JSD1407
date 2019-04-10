package se.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 迭代器，用来遍历集合
 * @author sige
 *
 */
public class IteratorDemo {
  public static void main(String[] args) {
//	 Collection c = new ArrayList();
//	 Collection c = new LinkedList();
	 Collection c = new HashSet();
	 c.add("a");
	 c.add("b");
	 c.add("c");
	 c.add("d");
	 c.add("e");
	 /*
	  * Iterator是一个接口
	  * java希望我们使用统一的方式遍历所有集合
	  * 使用迭代器遍历集合必须遵循以下过程：
	  * 问，取，删(删除不是必须操作)
	  */
	 Iterator it = c.iterator();
	 /*
	  * boolean hashNext()
	  * 询问迭代器，遍历的集合是否还有元素可以取出
	  */
	  while(it.hasNext()){
		  Object obj = it.next();
		  String str = (String)obj;
		  System.out.println(str);
	  }
	 
  }
}
