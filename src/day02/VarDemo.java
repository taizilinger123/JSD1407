package day02;
//变量的演示
public class VarDemo {
      public static void main(String[] args) {
    		/*
  		 * 练习:
  		 * 1.声明一个整型变量，名为n
  		 * 2.一条语句中声明3个整型变量，
  		 *   分别为a,b,c，只有a有值为25
  		 * 3.声明变量，演示变量的命名
  		 *   写几个正确的，写几个错误的
  		 * 
  		 * 4.两种方式初始化变量(声明同时，先声明再)
  		 * 5.声明1个变量名为m，并赋初值为100
  		 *   重新设置m的值为其本身加上200
  		 *   输出m的值
  		 * 6.声明1个整型变量k，输出k的值-----??????
  		 */
  		
  		int a;
  		//System.out.println(a);//编译错误，a未初始化
  		//int b=a+1;//编译错误，a未初始化
  		
  		int b=3; //声明同时初始化(第一次赋值)
  		int c;
  		c=5;    //先声明再初始化
  		
  		//int d=2.5;//编译错误，类型不匹配
  		int n=10;
  		n=n+100;//n=110，在其本身基础之上增100
  		 		
  		/*
  		int num; //声明一个整型变量，名为num
  		int a,b=2,c;//声明3个int变量，名为a,b,c
  		            //a和c没有值，b的值为2
  		//d=4; //编译错误，d没有声明
  		
  		int score,_score,a1,a$,$abc;
  		int age,teacherAge,javaTeacherAge;
  		//int 1a; //编译错误，不能以数字开头
  		//int class;//编译错误，不能使用关键字
  		//Score=25;//编译错误，区分大小写
  		int myscore; //可以，但不建议
  		int aa;       //可以，但不建议
  		*/
	}
}
