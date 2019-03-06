package se.day02;
/**
 * 身份证号验证
 * @author sige
 *
 */
public class StringDemo2 {
   public static void main(String[] args) {
	  /*
	   * \d{15}(\d{2}[0-9xX])?
	   * 
	   */
	   String regex = "\\d{15}(\\d{2}[0-9xX])?";
	   String id = "11010219880215789X";
	   if(id.matches(regex)){
		   System.out.println("是身份证号");
	   }else{
		   System.out.println("不是身份证号");
	   }
  }
}
