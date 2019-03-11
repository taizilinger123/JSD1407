package se.day02;
/** 
 * 包装类:用于使基本类型可以参与面向对象开发                       
 * int的包装类是Integer    父类 java.lang.Number
 * char的包装类是Character 父类 java.lang.Object
 * long     Long        父类 java.lang.Number
 * double   Double      父类 java.lang.Number
 * short    Short       父类 java.lang.Number
 * float    Float       父类 java.lang.Number
 * byte     Byte        父类 java.lang.Number
 * boolean  Boolean     父类 java.lang.Object
 * 包装类都是final的，不能定义他们的子类，不可变类
 * 8个 包装类都可以使用new
 * Integer i = new Integer(1);
 * Double d = new Double(1.2);
 * Short  s = new Short((short)1);
 */
public class IntegerDemo {
   public static void main(String[] args) {
	  dosome("abc");
	  dosome(new Teacher());
	  dosome(args);
	  int i = 1;
	  Integer in = new Integer(i);
	  i = in.intValue();
	  dosome(in);
   }
   public static void dosome(Object obj) {
          
   }
}

class Integer{
	private int i;
	public Integer(int i){
		this.i = i;
	}
	public int intValue(){
		return this.i;
	}
}
