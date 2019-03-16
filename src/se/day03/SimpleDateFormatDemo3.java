package se.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算生命值
 * @author sige
 *
 */
public class SimpleDateFormatDemo3 {
   public static void main(String[] args) throws ParseException {
	  /*
	   * 需求：
	   *   输入一个生日,输出到今天为止一共活了多少天
	   * 思路:
	   *   1：将生日字符串转换为Date
	   *   2：创建一个Date表示系统时间(今天)
	   *   3：获取今天的毫秒值
	   *   4：获取生日的毫秒值
	   *   5：用今天的毫秒值-生日的毫秒值
	   *   6：已经计算活了多少毫秒了
	   *     将该值除以一天的毫秒值就能得出一共活了多少天
	   *   7：输出该天数完成功能
	   */
	   System.out.println("请输入你的生日：(格式为yyyy-MM-dd)");
	   Scanner scanner = new Scanner(System.in);
	   String birthday = scanner.nextLine();
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   Date birDate = sdf.parse(birthday);
	   
	   //获取当前系统时间
	   Date now = new Date();
	   long birlong = birDate.getTime();
	   long nowlong = now.getTime();
	   
	   long agelong = nowlong-birlong;
	   long days = agelong/(24*60*60*1000);
	   System.out.println("恭喜你已经活了:"+days+"天");
	   System.out.println("距离诞辰100周年还有："+(36500-days)+"天");
   }
}
