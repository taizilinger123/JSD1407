package day04;
//for演示
public class ForDemo {
	public static void main(String[] args) {
		/*
		for(int count=1;count<=3;count++){
			System.out.println("跑圈");
		}
		for(int num=1;num<=10;num++){
			System.out.println("行动是成功的阶梯");
		}
		for(int num=1;num<=9;num++){
			System.out.println(num+"*9="+num*9);
		}
		*/
		/*
		int sum = 0;   //存和
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		*/
		/*
		 * sum=0
		 * i=1 sum=1
		 * i=2 sum=1+2
		 * i=3 sum=1+2+3
		 * i=4 sum=1+2+3+4
		 */
		/*
		int i=1;
		for(;i<=3;i++){
			System.out.println("跑圈");
		}
		*/
		/*
		for(int i=1;i<=3;){
			System.out.println("跑圈");
			i++;
		}
		*/
		/*
		for(;;){
			System.out.println("跑圈");
		}
		*/
		/*
		int i=1;
		for(;i<=3;){ //跟while(i<3)一样
			System.out.println("跑圈");
			i++;
		}
		*/
		/*
		for(int i=1,j=1;i<=4;i++,j--){ //中间的i<4只能写一个条件，写多个就要用逻辑条件
		}
		*/
		/*
		 * i=1,j=1 true 体
		 * i=2,j=0 true 体
		 * i=3,j=-1 true 体
		 */
		/*
		//break:跳出循环
		//输出1 2 3
		for(int i=1;i<=10;i++){
			if(i==4){
				break;  //终止循环
			}
			System.out.println(i);
		}
		*/
		
		//从1输出到10，所有3的倍数不要
		for(int i=1;i<=10;i++){
			if(i%3!=0){
				System.out.println(i);
			}
		}
		
		//continue:跳过循环体中剩余语句
		//         而进入下一次循环
		for(int i=1;i<=10;i++){
			if(i%3==0){
				//continue;//直接去到i++
			}else{
				System.out.println(i);
			}
		}
		/*
		 * i=1  输出1
		 * i=2  输出2
		 * i=3
		 * i=4  输出4
		 * i=5  输出5
		 * i=6
		 */		
	}
}
