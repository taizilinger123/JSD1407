package day04;
import java.util.Scanner; 
//随机加法运算器
public class Addition {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int score = 0;//分数
	for(int i=1;i<=3;i++){
		int a=(int)(Math.random()*100);
		int b=(int)(Math.random()*100);
		int result=a+b;//预存正确答案
		System.out.println("("+i+")."+a+"+"+b+"=?");
		System.out.println("算吧！");
		int answer = scan.nextInt();
		if(answer == -1){
			break;
		}else if(answer==result){
			System.out.println("正确");
			score+=10;
//			continue;//无意义
		}else{
			System.out.println("错误");
		}
	}
	System.out.println("score="+score);
}  
}
