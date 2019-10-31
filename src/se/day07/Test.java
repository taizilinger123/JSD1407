package se.day07;

import java.util.Arrays;

/**
 * 变长参数
 * @author sige
 *
 */
public class Test {
	public static void main(String[] args) {
	  //String []args, String args[], String[] args干嘛用呢？javac HelloWorld.java->java HelloWorld->java HelloWorld aaa aaa aaa aaa传参数用
      test(1,"a","b","c","d");
	}
	
	public static void test(int a,String... str){
		//String... str, String ...str,加参数之前在String...数组之前，后面不能加.
        System.out.println(Arrays.toString(str));		
	}
}
