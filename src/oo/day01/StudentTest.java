package oo.day01;
//学生类的测试类
public class StudentTest {
	public static void main(String[] args) {
	  //创建一个学生对象
      Student zs = new Student();//和Student.java必须在同一个包里，可以直接写
      //给成员变量赋值
      zs.name = "zhangsan";
      zs.age = 25;
      zs.address = "河北廊坊";
      //调用方法
      zs.study();
      zs.sayHi();
      
	  Student ls = new Student();
	  ls.name = "lisi";
	  ls.age = 26;
	  ls.address = "黑龙江佳木斯";
	  ls.study();
	  ls.sayHi();
	  
	  Student ww = new Student();
	  ww.study();
	  ww.sayHi();//引用类型为null,基本类型为0
	}
}
