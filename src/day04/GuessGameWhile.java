package day04;
import java.util.Scanner;
//猜数字之while 
public class GuessGameWhile {
	public static void main(String[] args) {
      Scanner  scan = new Scanner(System.in);
      //藏起来的那个数
      int num = (int)(Math.random()*1000+1);
      //Math.random是[0,1)的数
      System.out.println(num);
      System.out.println("猜吧!");
      int guess = scan.nextInt();//要素1 
      while(guess != num){ //要素2
    	  if(guess == 0){
    		  break;  //提前终止
    	  }else if(guess>num){
    		  System.out.println("太大了");
    	  }else{
    		  System.out.println("太小了");
    	  }
          System.out.println("猜吧!");
          guess = scan.nextInt();//要素3 
      }
      if(guess == num){
    	  System.out.println("恭喜，猜对了");
      }else{
    	  System.out.println("下次再来");
      }    		  
	}
}
