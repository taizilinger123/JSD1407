package day04;
import java.util.Scanner;
//课后作业
public class Homework {
	public static void main(String[] args) {
	  /*
		//变量的作用域/范围:
		//1.从变量声明开始到包含它最近的大括号结束
		//2.作用范围重叠时，变量不能同名
		int a=5;
		if(a>2){
			int b=6;
			//int a=88;//编译错误，不能同名
		}else{
			int b=8;
		}
		*/
		
		/*
		int a=5;
		if(a>2){
			int b = 8;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		//System.out.println(b);//编译错误，超范围
		*/

		/*
		//求两个数中的最大值
		Scanner scan = new Scanner(System.in);
		System.out.println("输入两个整数a,b");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int max = a>b?a:b;
		System.out.println("max=" + max);
		*/
		
		/*
		//三个数的排序---从小到大
		int a=88,b=27,c=44;
		if(a>b){
			int t=a;
			a=b;
			b=t;
		}
		if(a>c){
			int t=a;
			a=c;
			c=t;
		}
		if(b>c){
			int t=b;
			b=c;
			c=t;
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		*/
		/*
		//个人所得税
		double salary = 10000;  //工资
		double taxSalary = salary-3500;//纳税工资
		double tax=0; //税
		if(taxSalary<1500){
			tax = taxSalary*0.03-0;
		}else if(taxSalary<4500){
			tax = taxSalary*0.1-105;
		}else if(taxSalary<9000){
			tax = taxSalary*0.2-555;
		}
		System.out.println("税:"+tax);
		*/
		
		//根据年和月，算天数
		int year=2000,month=8,days=0;
		switch(month){
		case 1:
		case 3: //以此为入口
		case 5: //多个case中间无代码，相当于||效果
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if(year%4==0 && year%100!=0 || year%400==0){
				days=29;
			}else{
				days=28;
			}
		}
		System.out.println(days);
	}

}