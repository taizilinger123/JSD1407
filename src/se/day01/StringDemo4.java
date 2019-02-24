package se.day01;
/**
 * String subString(int start,int end)
 * 截取当前字符串的部分内容
 * @author sige
 *
 */
public class StringDemo4 {
  public static void main(String[] args) {
	  //            012345678901234567890
	  String str = "http://www.oracle.com.cn";
	  /*
	   * 使用两个数字表示范围，java都是含头不含尾的
	   */
	  String sub=str.substring(11,17);
	  System.out.println(sub);
	  /*
	   * 切一刀取后面
	   */
	  sub = str.substring(11);
	  System.out.println(sub);
	  /*
	   * www.oracle.com
	   * 获取域名
	   * 思路：
	   * 1：获取第一个"."的位置，对其+1就是后面的第一个
	   *   字符的位置
	   * 2：获取第二个"."的位置
	   */
	   int start = str.indexOf(".");
	   int end = str.indexOf(".",start+1);
	   sub = str.substring(start+1,end);
	   System.out.println(sub);	  
  }
}
