package day06;
//方法演示
public class MethodDemo {
	public static void main(String[] args) {   
		//say(); //程序从main开始，从main结束，不管什么一定要写在main里
		//sayHi();
		//sayHi(22);
		sayHi("zhangsan");//String name="zhangsan"
		sayHi("lisi");//String name="lisi"
		
		sayHello("zhangsan",28);
		//sayHello(28,"zhangsan"); //类型，顺序，个数---匹配
		
		int n = sum();
		System.out.println(n);
		
		int m = plus(8,9);
		System.out.println(m);
		
	}
	
	public static int plus(int a,int b){
		//return 2.5;  //类型不匹配
		
		//int c = a+b;
		//return c;
		
		return a+b;
	}
	
	public static int sum(){//不是void必须写返回值return,下面的方法是int,main里面调用方法名的返回值也要写int,一一对应.
		int a=5,b=6;
		int c=a+b;
		return c; //c的类型必须是int
	}
	public static void sayHello(String name,int age){
	}
	public static void sayHi(String name){
		System.out.println("大家好，我叫" + name);
	}
	//无返回值无参
	public static void say(){
		System.out.println("大家好，我叫WKJ");
	}
}
