package oo.day04;
//static的演示
public class StaticDemo {
	public static void main(String[] args) {
       Loo o1 = new Loo();
       o1.show();//a=1,b=1
       Loo o2 = new Loo();
       o2.show();//a=1,b=2
	}
}

class Loo{
	int a;
	static  int b;
	Loo() {
		a++;
		b++;
	}
	void show(){
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}