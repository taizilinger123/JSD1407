package se.day01;
/**
 * indexOf
 * 检索字符串位置
 * @author sige
 *
 */
public class StringDemo3 {
   public static void main(String[] args) {
	  //            0123456789012345 
	  String str = "thinking in java";
	  int index = str.indexOf("in");//2
	  System.out.println("index:"+index);
	  /*
	   * indexOf(String str,int index)
	   * 查找给定字符串在当前字符串中的位置
	   * 首先第一个参数要在当前字符串中找到
	   * 然后返回第一个字母所在的下标位置
	   */
	  index = str.indexOf("in",3);
	  System.out.println("index:"+index);
	  //返回给定字符串最后一次出现的位置
	  index = str.lastIndexOf("in");
	  System.out.println("index:"+index);
	  
	  //email  @   
	  String  mail = "123@123123.co";
	  index = mail.indexOf("@");
	  if(index>0&&index<mail.length()-1){
		  System.out.println("是邮箱");
	  }else{
		  System.out.println("不是邮箱");
	  }
	  
	  
	  
	  
	  
	  
	  
   }
}
