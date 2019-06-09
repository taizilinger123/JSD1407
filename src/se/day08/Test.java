package se.day08;


import java.util.ArrayList;
import java.util.List;

/**
 * JAVA就近调用原则
 * @author sige
 *
 */
public class Test {
  public static void main(String[] args) {
	 dosome(null);
//	 null是引用类型，先调用子类，抽象类和接口
  }
  
  public static void dosome(ArrayList d){
	  System.out.println("arrayList");
  }
  public static void dosome(List d){
	  System.out.println("list");
  }
  public static void dosome(Object d){
	  System.out.println("object");
  }
}
