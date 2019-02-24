package se.day01;
/**
 * 去除字符串两边的空白
 * String trim()
 * @author sige
 *
 */
public class StringDemo5 {
   public static void main(String[] args) {
	  String str = "    Hello World			";
	  String trim = str.trim();
	  System.out.println(str);
	  System.out.println(trim);
  }
}
