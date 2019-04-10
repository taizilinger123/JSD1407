package se.day04;
/**
 * 新循环还可以遍历数组
 * @author sige
 *
 */
public class NewForDemo2 {
  public static void main(String[] args) {
	 String[] array = {"1","2","3","4","5"};
	 for(int i=0;i<array.length;i++){
		 System.out.println(array[i]);
	 }
	 
	 for(String str:array){
		 System.out.println(str);
	 }
  }
}
