package se.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import se.day03.Cell;



/**
 * comparable接口
 * @author sige
 *
 */
public class SortCollection2 {
  public static void main(String[] args) {
	List<Cell> list = new ArrayList<Cell>();
	list.add(new Cell(4,5));
	list.add(new Cell(1,7));
	list.add(new Cell(1,2));
	list.add(new Cell(3,3));
	System.out.println(list);
	/*
	 * 使用Collections的sort方法进行排序的
	 * 集合，要求元素必须实现Comparable接口
	 * 只有实现了该接口才认为是可比较的元素
	 */
	Collections.sort(list);
	
  }
}
