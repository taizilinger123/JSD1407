package se.day02;
/**
 * 字符串支持正则表达式的方法1：
 * 匹配格式
 * @author sige
 *
 */
public class StringDemo1 {
   public static void main(String[] args) {
	  /*
	   * 邮箱地址
	   * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9]+)+
	   */
	   String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";
       String mail = "fancq@tarena.com.cn";
       /*
        * boolean matches(String regex)
        * 使用给定的正则表达式验证当前字符串是否满足
        * 格式要求，满足返回true
        * 字符串matches是全匹配的
        */
       boolean match = mail.matches(regex);
       if(match){
           System.out.println("是邮箱");
       }else{
    	   System.out.println("不是邮箱");
       }

   }
}
