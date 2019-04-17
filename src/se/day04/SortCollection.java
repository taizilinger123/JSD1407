package se.day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序
 * @author sige
 *
 */
public class SortCollection {
  public static void main(String[] args) {
//	 Collection<Integer> c = new ArrayList<Integer>();因为是List集合才有排序，set是无序集所以把Collection换成List
	 List<Integer> c = new ArrayList<Integer>();
	 Random random = new Random();
	 for(int i=0;i<10;i++){
		 c.add(random.nextInt(100));
	 }
	 System.out.println(c);
	 /*
	  * 通过Collections这个集合的工具类
	  * 我们可以对List集合进行自然排序
	  */
	 Collections.sort(c);
	 System.out.println(c);
	 
	 
  }
}
