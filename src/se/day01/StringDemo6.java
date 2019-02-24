package se.day01;
/**
 *获取给定位置上的字符
 *char charAt(int index)
 * @author sige
 *
 */
public class StringDemo6 {
   public static void main(String[] args) {
	  String str = "HelloWorld";
	  char c = str.charAt(5);
	  System.out.println(c);
	  
	  /*
	   * 检查回文
	   * 0 1234 5678
	   * 上海自来水来自海上
	   * 思路：
	   * 1：循环判断
	   * 2：正数位置上的字符与倒数位置上的字符都一样
	   */
	  str = "上海自来水来自海上";
	  for(int i=0;i<str.length()/2;i++){
		  if(str.charAt(i)!=str.charAt(str.length()-1-i)){
			  System.out.println("不是回文");
			  return;
		  }
	  }
	  System.out.println("是回文");	  
  }
}
