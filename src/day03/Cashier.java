package day03;
import java.util.Scanner;
//收银台程序
public class Cashier {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入单价:");
		double unitPrice = scan.nextDouble();
		System.out.println("请输入数量:");
		double amount = scan.nextDouble();
		System.out.println("请输入金额:");
		double money = scan.nextDouble();
		
		//应收金额
		double totalPrice = unitPrice * amount;
		//满500打8折
		if(totalPrice>=500){  
			totalPrice *= 0.8;
		}
		
		if(money>=totalPrice){ //看钱够不够
		  //钱够，找零
			double change = money - totalPrice;
			System.out.println("应收金额:"+totalPrice+",找零:"+change);
		}else{ //钱不够，提示
			System.out.println("Error!钱不够");
		}
		
	}
}