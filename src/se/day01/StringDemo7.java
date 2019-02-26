package se.day01;
/**
 * 判断当前字符串是否是以给定的字符串开头或结尾的
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * @author sige
 *
 */
public class StringDemo7 {
   public static void main(String[] args) {
	   String  str = "Thinking In Java";
	   boolean starts = str.startsWith("Thin");
	   if(starts){
		   System.out.println("开头");
	   }else{
		   System.out.println("不是开头");
	   }
	   
	   
	   boolean ends = str.endsWith("In  Java");
	   if(ends){
		   System.out.println("结尾");
	   }else{
		   System.out.println("不是结尾");
	   }
   }
}
