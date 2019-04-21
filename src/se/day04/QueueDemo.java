package se.day04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列  java.util.Queue
 * 保存一组数据，存取元素必须遵循先进先出原则
 * FIFO(First Input First Output)
 * @author sige
 *
 */
public class QueueDemo {
  public static void main(String[] args) {
	 Queue<String> queue = new LinkedList<String>();
	 /*
	  * boolean offer(T t)
	  * 入队方法
	  * 将给定元素添加到队列末尾。添加成功返回true
	  */
	 queue.offer("A");
	 queue.offer("B");
	 queue.offer("C");
	 queue.offer("D");
	 System.out.println(queue);
	 /*
	  * T poll()
	  * 用于获取队首元素。出队操作
	  * 获取后，队列中将不在包含该元素
	  */
//	 String str = queue.poll();
//	 System.out.println(str);
//	 System.out.println(queue);
	 /*
	  * T peek()
	  * 用于获取队首元素，仅引用，不做出队操作。
	  */
//	 str = queue.peek();
//	 System.out.println(str);
//	 System.out.println(queue);
	 
	 /*
	  * 遍历队列
	  * 遍历队列是一次性的
	  */
	 while(queue.size()>0){
		 String str = queue.poll();
		 System.out.println(str);
	 }
	 System.out.println(queue);
  }
}
