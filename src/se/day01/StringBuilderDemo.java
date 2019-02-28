package se.day01;
/**
 * StringBuilder用于解决字符串频繁修改带来的内存消耗
 * 所以将来我们有频繁修改字符串内容这样的操作时，首选使用StringBuilder
 * @author sige
 *
 */
public class StringBuilderDemo {
   public static void main(String[] args) {
	  //内部默认为空字符串
	  StringBuilder builder = new StringBuilder();
	  //内部默认为字符串:HelloWorld
//	  StringBuilder builder = new StringBuilder("HelloWorld");
	  //努力学习java,为了找个好工作
//	  builder.append("努力学习java,为了找个好工作");
//	  String str = builder.toString();
//	  System.out.println(str);
//	  
//	  //努力学习java,为了改变世界
//	  builder.replace(9, 16, "为了改变世界");
//	  str = builder.toString();
//	  System.out.println(str);
//	  
//	  //,为了改变世界
//	  builder.delete(0, 8);
//	  str = builder.toString();
//	  System.out.println(str);
//	  
//	  //活着，为了改变世界
//	  builder.insert(0, "活着");	  
//	  str = builder.toString();
//	  System.out.println(str);	
//	  
//	  //简化代码步骤:从下到上，等量代换
//	  System.out.println(builder.toString());	
	  
//	  builder = builder.append("努力学习java,为了找个好工作");
//	  builder = builder.replace(9, 16, "为了改变世界");
//	  builder = builder.delete(0, 8);
//	  builder.insert(0, "活着");	
//	  #########################################
//	  builder.append("努力学习java,为了找个好工作")
//		       .replace(9, 16, "为了改变世界")
//		       .delete(0, 8)
//		       .insert(0, "活着");	
//	  
//	  String str = builder.toString();
//	  System.out.println(str);
	  
System.out.println(	
		   builder.append("努力学习java,为了找个好工作")
	      .replace(9, 16, "为了改变世界")
	      .delete(0, 8)
	      .insert(0, "活着")
	      .toString());

  }
}
