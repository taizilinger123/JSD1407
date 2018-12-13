package day04;
//while演示
public class WhileDemo {
	public static void main(String[] args) {
		/*
		int num=1;
		while(num<10){
			System.out.println(num+"*9="+num*9);
			num++;
		}
		System.out.println("over");
		*/
		
		
		int count=1;
		while(count<=3){
			System.out.println("跑圈");
			if(count==2){
				break;  //跳出循环
			}
			count++;
		}
		System.out.println("over");
		/*
		 * count=1 true 跑
		 * count=2 true 跑
		 * over
		 */
			
		
		/*
		int num=1; //1.循环变量初始化
		while(num<=10){ //2.循环条件
			System.out.println("行动是成功的阶梯");
			num++; //3.循环变量的改变
		}
		System.out.println("over");
		*/
		/*
		 * num=1 true 输出
		 * num=2 true 输出
		 * num=3 true 输出
		 * ...
		 * num=10 true 输出
		 * num=11 false 循环结束
		 * over
		 */	
		
	}
}
