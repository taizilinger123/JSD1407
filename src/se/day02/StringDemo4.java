package se.day02;
/**
 * 将字符串中满足正则表达式的部分替换为给定内容
 * String replaceAll(String regex,String replace)
 * @author sige
 *
 */
public class StringDemo4 {
   public static void main(String[] args) {
	   String str = "ab123sdab4543das756as876asd";
	   str = str.replaceAll("\\d+", "#num#");
//	   str = str.replaceAll("\\d", "#num#");
	   System.out.println(str);
   }
}
