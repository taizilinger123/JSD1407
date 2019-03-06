package se.day02;
/**
 * String split(String regex)
 * 将当前字符串中满足正则表达式的部分拆分
 * @author sige
 *
 */
public class StringDemo3 {
   public static void main(String[] args) {
//	   String  str = "boss.jack.marry.jackson";
//	   String  str = "boss jack  marry    jackson";
	   String  str = ",,,,,,,,,boss,jack,marry,jackson";
//	   String  str = "boss,jack,marry,jackson,,,,,,,,,";//后面的,,,,,,,,,不要了
//	   String[] array = str.split("\\.");
//	   String[] array = str.split("\\s+");
	   String[] array = str.split(",");
	   System.out.println(array.length);
	   for(int i=0;i<array.length;i++){
		   System.out.println(array[i]);
	   }
   }
}
