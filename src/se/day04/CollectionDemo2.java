package se.day04;

import java.util.ArrayList;
import java.util.Collection;

import se.day03.Cell;

/**
 * 删除元素
 * @author sige
 *
 */
public class CollectionDemo2 {
   public static void main(String[] args) {
	  Collection c = new ArrayList();
	  c.add(new Cell(1,2));
	  c.add(new Cell(2,3));
	  c.add(new Cell(3,4));
	  c.add(new Cell(1,2));
	  
	  Cell cell = new Cell(1, 2);
	  System.out.println(c);
	  /*
	   * boolean remove(Object o)
	   * 从当前集合中删除与给定元素第一个equals比较
	   * 为true的。
	   * 删除元素是根据元素的equals的结果判断的
	   */
	  c.remove(cell);
	  System.out.println(c);
   }
}
