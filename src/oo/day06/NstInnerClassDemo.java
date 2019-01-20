package oo.day06;
//匿名内部类的演示
public class NstInnerClassDemo {
	public static void main(String[] args) {
//		Inter2 o1 = new Inter2();//报错，接口不能实例化
		//1.创建了Inter2的一个子类，没有名字
		//2.为该子类创建了一个对象，引用叫o1
		//3.大括号中的为子类的类体
		Inter2 o1 = new Inter2(){
//			int a;
//			void show(){
//				
//			}
		};
		//1.创建了Inter2的一个子类，没有名字
		//2.为该子类创建了一个对象，引用叫o2
		//3.大括号中的为子类的类体
		Inter2 o2 = new Inter2(){
//			int a;
//			void show(){
//				
//			}
		};
		
//		Inter2 o2 = new Doo();
//		Inter2 o3 = new Doo();
//		Inter2 o4 = new Doo();
		
		final int num = 5;//分不同版本jdk加final
		//1.创建了Inter3的一个子类，没有名字
		//2.为该子类创建了一个对象，引用叫o3
		//3.大括号中为子类的类体
		Inter3 o3 = new Inter3(){
			public void show(){//必须重写Inter3的方法
				System.out.println("showshow");
				System.out.println(num);//num需加final
			}
		};
		o3.show();
	}
}

//class Doo implements Inter2{
//	int a;
//	void show(){
//		
//	}
//}


interface Inter3{
   public  void  show();
}
interface Inter2{	
}

