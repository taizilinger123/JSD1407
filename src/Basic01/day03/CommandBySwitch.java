package day03;
import java.util.Scanner;
//命令解析程序
public class CommandBySwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择功能:0,1,2");
		int command = scan.nextInt();
		
		switch(command){
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登录记录");
			break;
		case 0:
			System.out.println("欢迎使用");
			break;
		default:
			System.out.println("输入错误");
		}
	}

}