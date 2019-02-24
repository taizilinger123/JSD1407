package se.day01;

public class StringDemo {
	public static void main(String[] args) {
       String str = "HelloWorld";//字面量:一下子能看到值是多少
       str = str + "!";
       System.out.println(str);
       
       String str1 = "123Hello";
       String str2 = "123Hello";//重用了str1的对象
       /*
        * 编译器小特性：
        * 当一个表达式运算两边都是字面量，那么编译的
        * 过程中就会进行计算，将结果生成在表达式
        * 的位置，可以节省运算时的开销
        */
       String str3 = "123"+"Hello";
       //String str3 = "123Hello";//字节码文件中的样子
       
       String str4 = 1+23+"Hello";
       String str5 = "1"+23+"Hello";
       String str6 = 1+"23"+"Hello";
       String str7 = 1+'2'+"3"+"Hello";
       String str8 = new String("123Hello");
       /*
        * new表示创建新对象，只有使用字面量赋值才会
        * 使用常量池中原来的对象进行重用。
        */
       
       System.out.println(str1==str2);//true
       System.out.println(str1==str3);//true
       System.out.println(str1==str4);//false
       System.out.println(str1==str5);//true
       System.out.println(str1==str6);//true
       System.out.println(str1==str7);//false
       System.out.println(str1==str8);//false
	}
}
