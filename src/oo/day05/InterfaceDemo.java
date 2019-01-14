package oo.day05;
//接口的演示
public class InterfaceDemo {
	public static void main(String[] args) {
        //Inter5 o1 = new Inter5();//编译错误，接口不能被实例化 
		Inter6 o2 = new Foo();//向上造型
		Inter5 o3 = new Foo();//向上造型
  }
}
//演示接口间的继承
interface Inter5{
	void show();
}
interface Inter6 extends Inter5{
	void say();
}
class Foo implements Inter6{
	public void show(){};
	public void say(){};
}

//演示又继承类又实现接口
interface Inter3{
	void show();
}
interface Inter4{
	void say();
}
abstract class Doo{
	abstract void test();//默认是public
}
class Eoo extends Doo implements Inter3,Inter4{
	public void show(){};
	public void say(){};
	void test(){};//不写默认就是public,大于等于public
}

//演示接口的实现
interface Inter2{
	void show();
	void say();
}
class Coo implements Inter2{
	public void show(){};
	public void say(){};
}

//演示接口的基础语法
interface Inter1{
	public  static final double PI = 3.14159;//常量
	public  abstract void show();//抽象方法
	
	int NUM = 250;//默认public static final 
	void say();//默认public abstract
	
	//int count;//编译错误，常量必须声明同时初始化
	//void sayHi(){}//编译错误，接口中方法默认都是抽象方法
}