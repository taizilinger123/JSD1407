package oo.day05;
//static final常量的演示
public class StaticFinalDemo {
	public static void main(String[] args) {
		System.out.println(Aoo.PI);//通过类名点来访问
		//Aoo.PI = 3.1415926;//编译错误，常量不能被改变
		
		//1.加载Boo.class到方法区中
		//2.count保存在方法区中
		//3.到方法区中获取count并输出
		System.out.println(Boo.COUNT);
		
	    //编译时自动替换为具体的值---效率高
		//相当于System.out.println(5);
		System.out.println(Boo.NUM);
	}
}

class Boo{
	//public static final这3个词的顺序随便换
	public static final int  NUM = 5;//常量
	public static int  COUNT = 8;//静态变量
}

class Aoo{
	public static final double PI = 3.14159;
	//public static final int NUM;//编译错误，必须声明同时初始化
}
