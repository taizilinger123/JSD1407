package day03;
//分支结构演示
public class IfDemo {
	public static void main(String[] args) {
		/*
		//if块中若只有一句话，可以省略{}
		//但不建议
		int num = 5;
		if(num%2==0){
			System.out.println("是偶数");
		}
		System.out.println("over");
		*/
		
		/*
		int num=6;
		if(num%2==0){
			System.out.println("是偶数");
		}else{
			System.out.println("是奇数");
		}
		System.out.println("over");
		*/
		/*
		int num=3;
		if(num==1){
			System.out.println("111");
		}else if(num==2){
			System.out.println("222");
		}else if(num==3){
			System.out.println("333");
		}else if(num==4){
			System.out.println("444");
		}else{
			System.out.println("未知");
		}
		*/
		
		/*
		int num = 3;
		switch(num){ //只能为整型，double型报错
		case 1: //判断num==1
			System.out.println("111");
			break;
		case 2:
			System.out.println("222");
			break;
		case 3: //以此为入口
			System.out.println("333");
			break;//跳出switch
		case 4:
			System.out.println("444");
			break;
		default:
			System.out.println("未知");
		  break;
		}
		*/
		
		int choose = 2;
		switch(choose){
		case 1:
			System.out.println("呼叫讲师");
			break;
		case 3:
			System.out.println("呼叫班主任");
			break;
		case 2:
			System.out.println("呼叫项目经理");
			break;
		default: //所有case都不满足才走
			System.out.println("输入不合法");
		}		
	}
}