package day04;

import java.util.Scanner;

//猜数字do...while
public class GuessGameDoWhile {
	public static void main(String[] args) {
      Scanner  scan = new Scanner(System.in);
      int num = (int)(Math.random()*1000+1);
      System.out.println(num);
      int guess;
      do{
    	  System.out.println("猜吧!!!");
    	  guess = scan.nextInt();
    	  if(guess==0){
    		  break;
    	  }else if(guess>num){
    		  System.out.println("太大了");
    	  }else if(guess<num){
    		  System.out.println("太小了");
    	  }
      }while(guess != num);
      if(guess==num){
    	  System.out.println("恭喜，猜对了");
      }else{
    	  System.out.println("下次再来");
      }

	}
}
