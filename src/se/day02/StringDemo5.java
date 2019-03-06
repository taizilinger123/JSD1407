package se.day02;
/**
 * 
 * @author sige
 *
 */
public class StringDemo5 {
   public static void main(String[] args) {
	   String regex = "(wqnmlgb|cnm|dsb|rnmb|sb|db|djb)";
	   String message = "wqnmlgb!你怎么这么sb!cnm!你个dsb";
	   message = message.replaceAll(regex, "***");
	   System.out.println(message);
   }
}
