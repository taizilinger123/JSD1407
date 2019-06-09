package se.day08;


import java.util.ArrayList;
import java.util.List;

/**
 * JAVA就近调用原则
 * @author sige
 *
 */
public class Test1 {
  public static void main(String[] args) {
	 float s = 1;
	 dosome(null);
//	 null是引用类型，不是基本类型，先调用子类，抽象类和接口
  }
  
  public static void dosome(long d){
	  System.out.println("long");
  }
  public static void dosome(double d){
	  System.out.println("double");
  }
  public static void dosome(int d){
	  System.out.println("int");
  }
  public static void dosome(short d){
	  System.out.println("short");
  }
  public static void dosome(Double d){
	  System.out.println("Double");
  }
}
