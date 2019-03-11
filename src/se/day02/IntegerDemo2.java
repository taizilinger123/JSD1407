package se.day02;
/**
 * Number中的相关方法
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
      Double d = new Double(129.456);
      double dd = d.doubleValue();
      System.out.println(dd);
      
      int i = d.intValue();
      System.out.println(i);
      
      short s = d.shortValue();
      System.out.println(s);
      
      byte b = d.byteValue();
      System.out.println(b);
      
      Integer ii = new Integer(123);
      int iii = ii.intValue();
      System.out.println(iii);

	}
}
