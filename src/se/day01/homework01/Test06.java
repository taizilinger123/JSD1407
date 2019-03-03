package se.day01.homework01;
/**
 * 生成所有的汉字
 * @author sige
 * Apache commons-lang StringUtils
 * 
 */
public class Test06 {
   public static void main(String[] args) {
	  for(char c='\u4e00',i=0;c<='\u9fa5';c++,i++){
		    System.out.print(c);
		    if(i%50==0){
		    	System.out.println();
		    }		    
	  } 
   }
}

//public static void main(String[] args) {
//	  String str = "x/x/emp.action";
//	  int i = str.lastIndexOf("/");
//	  str = str.subString(i+1);
//}	
//
//char c = '\u4e00' 汉字起始编码
//char c = '\u9fa5' 汉字截止编码
//for(c='\u4e00';c<='\u9fa5';c++){
//   
//}