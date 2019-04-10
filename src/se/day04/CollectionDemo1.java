package se.day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的批量处理方法
 * @author sige
 *
 */
public class CollectionDemo1 {
   public static void main(String[] args) {
	   Collection conn1 = new ArrayList();
	   conn1.add("java");
	   conn1.add(".net");
	   conn1.add("c#");
	   conn1.add("php");
	   System.out.println(conn1);
	   
	   Collection conn2 = new ArrayList();
	   conn2.add("android");
	   conn2.add("ios");
	   /*
	    * boolean addAll(Collection c)
	    * 将给定的集合中的所有元素添加到当前集合中
	    * 当调用该方法后当前集合元素数量发生了变化
	    * 则返回true
	    */
	   conn1.addAll(conn2);
	   System.out.println(conn1);
	   
	   Collection conn3 = new ArrayList();
	   conn3.add("java");
	   conn3.add("ios");
	   /*
	    * boolean containsAll(Connection c)
	    * 查看当前集合中是否包含给定集合中的所有元素
	    * 全包含则返回true
	    * 这里判断含有还是根据元素的equals判断得结果
	    */
	   boolean containsAll = conn1.containsAll(conn3);
	   System.out.println("全包含:"+containsAll);
	   
	   
   }
}
