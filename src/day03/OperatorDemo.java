package day03;
//运算符演示
public class OperatorDemo {
  public static  void  main (String[] args){
	//算术：+,-,*,/,%,++,--
	//++,--单独使用，在前在后无差别
	//在使用时，在前在后有差别的：
	//  ++、--在前，先自增/减运算，再使用
	//  ++、--在后，先使用，再自增/减运算  
	//记忆方法：谁离的近的先算谁  
	  
	/*  
	int n=5,m=5;
	System.out.println(n++);//5，离println近的是n就算n=5
	System.out.println(++m);//6,离println近的是++就算5+1=6=m
	*/
	  
	/*  
	int n=5;
	int m=++n;//离m近的是++,先算5+1=6=m
	System.out.println(n);//6
	System.out.println(m);//6
	*/  
	  
	/*  
	int n=5;
	int m=n++;//离m近的是n,先算5=m
	System.out.println(n);//6
	System.out.println(m);//5
	*/  

	/* 
	int n=5;
    //n++;//自增，相当于n=n+1
	++n;  //自增，相当于n=n+1
	System.out.println(n);//6
    */
	
  }
}
