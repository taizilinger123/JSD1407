package day02;
//演示数据类型
public class DataTypeDemo {
	public static void main(String[] args){
		/*
		//int:整型，4个字节
		int a = 88; //88为直接量，java默认int型
		//100亿写出来就是错的，默认为int，但超了
		//int b = 10000000000;
		int b = 5/3;
		System.out.println(b);//1，小数无条件舍去
		
		//溢出是需要避免
		int m = 2147483647;//m为int的最大值
		m = m+1; //最大值基础之上加1----溢出
		System.out.println(m);//int的最小值
		*/
		
		/*
		//long:长整型，占8个字节
		long a = 88L; //88L为long型直接量
		//long b = 10000000000;//错误，原因同上
		long b = 10000000000L;
		
		//运算时，以最大类型作为最终类型
		long c = 1000*1000*1000*1000*2L;
		System.out.println(c);//溢出
		long d = 2L*1000*1000*1000*1000;
		System.out.println(d);//不溢出
		
		//获取自1970.1.1零时到现在的毫秒数
		//作用:下周一、二讲了，现在先记住
		long time = System.currentTimeMillis();
		System.out.println(time);
		*/
		
		/*
		//double:浮点型/小数型，占8个字节
		double a = 55.6;//55.6小数直接量，默认double型
		//float b = 55.6;//错误，类型不匹配
		float b = 55.6F;
		
		//double和float都有舍入误差
		//float占4个字节
		//想解决可以使用BigDecimal
		double c=3.0,d=2.9;
		System.out.println(c-d);//舍入误差
		//运算时以最大类型作为最终类型
		int e = 5/2;
		double f = 5/2;
		double g = 5.0/2;
		System.out.println(e); //2
		System.out.println(f); //2.0
		System.out.println(g); //2.5
		
		double h=0; //占8个字节
		*/
		
		/*
		//char:字符型，占2个字节
		//     只能存储一个字符
		char c1='A'; //'A'为字符型直接量
		char c2=65;  //65为'A'所对应的码(整数)
		System.out.println(c1);
		System.out.println(c2);
		
		//char cc='AB';//错误，有且仅有一个
		//char c3='';//编译错误，必须有字符
		//char c4=''';//错误，'为特殊字符
		char c5='\'';//正确，转义字符
		System.out.println(c5);
		
		//字符实际上存储的就是一个整数(码)
		//'0'码48，'a'码97，'A'码65
		int m = 2 + 2;
		int n = '2' + '2'; //50+50
		System.out.println(m); //4
		System.out.println(n); //100
		*/
		
		/*
		//boolean:布尔型，存储true或false
		//        占1个字节
		boolean a = true;
		boolean b = false;
		//boolean c = 2;//错误，类型不匹配
		*/
		
		/*
		 * 1.声明double型变量，存储8.88
		 *   声明float型变量，存储8.88
		 * 2.输出5/2以及5.0/2的结果，看一看
		 * 3.声明两个double型变量，
		 *   分别存储3和2.9
		 *   输出相减的结果
		 * 4.声明char型变量，使用两种方式存储小a
		 *   方式一:字符直接量
		 *   方式二:码(97)
		 * 5.计算2+2以及'2'+'2'的结果，看一看
		 * 6.声明两个boolean型变量，
		 *   分别存储true和false
		 *   
		 */
		
		/*
		 * 数据类型转换，两种方式:
		 * 1)自动类型转换:小到大
		 * 2)强制类型转换:大到小
		 */
		
		int a = 55;
		long b = a;//自动类型转换--小到大
		int c = (int)b; //强制类型转换--大到小
		//int c = b;//错误，大到小必须强制转
		
		long d = 10000000000L;
		int e = (int)d;
		System.out.println(e);//强转时溢出
		
		double dou = 3.88888888888888;
		float g = (float)dou;
		System.out.println(g);//强转时精度丢失
		
		byte b1 = 127;
		//byte b1 = 128;//错误，超了byte的范围
		
		//java的两点规则:
		//1.整数直接量可以直接赋给byte,char,short
		//2.byte,char,short参与运算时，一律转为int
		short s1=5;
		short s2=6;//规则1
		short s3=(short)(s1+s2);//规则2
		//short s3=s1+s2;//错误，s1+s2为int型

		/*
		 * 1.声明int型变量a，存储55
		 *   声明long型变量b，存储a---什么现象?
		 *   声明int型变量c，存储b----什么现象?
		 * 2.声明long型d，存储100个亿
		 *   声明int型e，存储d--------什么现象?
		 * 3.声明double型dou,存储5.55
		 *   声明int型f，存储doub-----什么现象?
		 * 4.如下代码演示:
		 *     byte b1=55,b2=66;
		 *     byte b3=b1+b2;--------?????
		 */
		
		
		/*
		 * 1.声明整型变量a，存储55
		 * 2.声明整型变量b，存储8/3的结果
		 *   输出b的值
		 * 3.声明整型变量c，存储2147483647(最大值)
		 *   重新给c赋值为其本身加1---查看溢出
		 * 4.声明long型变量d，赋值为long型直接量
		 * 5.声明long型变量e，
		 *   存储4个1000相乘的结果--要保证不溢出
		 * 6.声明long型变量f，
		 *   存储自1970.1.1零时到现在的毫秒数
		 */
		
	}
}
