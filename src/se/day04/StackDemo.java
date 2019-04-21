package se.day04;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 用于存储一组数据，存取元素必须遵循先进后出原则
 * 通常用于记录一组操作可追溯
 * @author sige
 *
 */
public class StackDemo {
  public static void main(String[] args) {
	Deque<String> stack = new LinkedList<String>(); 
	/*
	 * void push(T t)
	 * 向栈顶“压入”一个元素
	 * 入栈操作
	 */
	stack.push("A");
	stack.push("B");
	stack.push("C");
	stack.push("D");
	System.out.println(stack);
	/*
	 * T pop()
	 * 取出栈顶元素，出栈操作
	 * 取出后，该元素会从栈中删除
	 */
	String str = stack.pop();
	System.out.println(str);
	System.out.println(stack);
	
	str = stack.peek();
	System.out.println(str);
	System.out.println(stack);
	/*
	 * 同样的，遍历栈也是一次性的
	 */
	while(stack.size()>0){
		str = stack.pop();
		System.out.println(str);
	}
	System.out.println(stack);
  }
}
