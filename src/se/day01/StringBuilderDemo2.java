package se.day01;
/**
 * 字符串反转
 * @author sige
 *
 */
public class StringBuilderDemo2 {
   public static void main(String[] args) {
	   String str = "上海自来水来自海上";
//	   StringBuilder builder = new StringBuilder(str);
	   //StringBuffer是StringBuilder的祖宗，StringBuffer是线程安全的，不常用java才出StringBuilder
	   StringBuffer builder = new StringBuffer(str);
	   builder.reverse();
	   String str2 = builder.toString();
	   if(str.equals(str2)){
		   System.out.println("yes");
	   }else{
		   System.out.println("no");
	   }

  }
}
