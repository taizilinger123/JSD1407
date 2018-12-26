package oo.day01;
//引用类型画等号与Null
public class Demo {
	public static void main(String[] args) {
	  /*	
      Cell c1 = new Cell();
      Cell c2 = c1;
      c1.row = 2;
      c2.row = 5;
      System.out.println(c1.row);//5,对其中一个的修改会影响另外一个
      
      int a = 5;
      int b = a;
      a = 8;
      b = 88;
      System.out.println(a);//8,对其中一个的修改不会影响另外一个
      */
	  Cell c = new Cell();
	  c.row = 2;
	  c = null;//空，没有指向任何对象
	  c.row = 2;//NullPointerException异常
//	  Exception in thread "main" java.lang.NullPointerException
//		at在哪里位置 oo.day01.Demo.main(Demo.java:21)往上找引用c
	}
}
