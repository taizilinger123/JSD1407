package day03;
//运算符演示
public class OperatorDemo {
	public static void main(String[] args){
		/*
		 * 练习:
		 * 1.声明a赋值为5
		 *   a++ 输出a的值
		 *   ++a 输出a的值
		 * 2.声明b赋值为5
		 *   声明c赋值为b++
		 *   输出b和c的值
		 * 3.声明d赋值为5
		 *   声明e赋值为++d
		 *   输出d和e的值
		 * 4.声明m,n，都赋值为5
		 *   输出m++的值
		 *   输出++n的值
		 */
	
		//算术:+,-,*,/,%,++,--
		//++,--单独使用，在前在后无差别
		//在使用时，在前在后有差别的：
		//  ++、--在前，先自增/减运算，再使用
		//  ++、--在后，先使用，再自增/减运算

		/*
		int n=5,m=5;
		System.out.println(n++); //5
		System.out.println(++m); //6
		 */
		/*
		int n=5;
		int m=++n;
		System.out.println(n);  //6
		System.out.println(m);  //6
		*/
		/*
		int n=5;
		int m=n++;
		System.out.println(n); //6
		System.out.println(m); //5
		*/
		/*
		int n=5;
		//n++; //自增，相当于n=n+1
		++n;   //自增，相当于n=n+1
		System.out.println(n); //6
		*/
		
		/*
		//关系:>,<,>=,<=,==,!=
		//关系运算的结果为boolean类型(true/false)
		int a=5,b=8,c=5;
		boolean b1 = a>b;
		System.out.println(b1);  //false
		System.out.println(b>c); //true
		System.out.println(a==c);//true
		System.out.println(a>=c);//true
		*/
		/*
		//逻辑:&&,||,!
		//逻辑是连接关系的，结果也为boolean型
		int a=100,b=200;
		boolean b1 = a>10 && b<10;
		System.out.println(b1);  //false
		System.out.println(a>10 && b>10);//true
		System.out.println(a>b || b>10);//true
		System.out.println(a>b || b<10);//false
		System.out.println(!(a>b));//true
		*/
		/*
		//&&:当第一个数为false时短路(第二个不走)
		//||:当第一个数为true时短路(第二个不走)
		int a=100,b=200;
		//boolean b1 = a>b && a++>0;
		boolean b1 = a<b || a++>0;
		System.out.println(a);  //100，短路
		System.out.println(b1); //false
		*/
		
		/*
		//赋值:=,+=,-=,*=,/=,%=
		int a;
		a = 5; //赋值运算(最后才赋值) 
		System.out.println(a); //5
		a += 10;//相当于a=a+10
		System.out.println(a); //15
		a *= 2; //相当于a=a*2
		System.out.println(a); //30
		*/
		
		/*
		//字符串拼接:+
		//+左右为数字时，做加法运算
		//+左右有一边为字符串("")时，做连接
		int a=10;
		System.out.println(a);   //10
		System.out.println("a="); //a=
		System.out.println("a="+a);//a=10
		int b = 200;
		System.out.println("b的值是"+b);
		
		int c=100,d=200;
		System.out.println(c+d+"");//300串
		System.out.println(""+c+d);//100200串
		*/
		
		/*
		//三目/条件运算 boolean ? 1 : 2
		//运算过程:
		//1.计算boolean的值
		//2.若为true，则整个的结果为1的值
		//  若为false，则整个的结果为2的值
		int a=5,b=6;
		int max = a>b ? a : b;
		System.out.println(max);
		*/				
	}
}