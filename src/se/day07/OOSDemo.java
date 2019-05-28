package se.day07;

import java.util.List;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * ObjectOutputStream
 * 是一个高级流
 * 该流的功能是可以将给定的对象转换为字节
 * 后写出
 * 用于对象序列化
 * @author sige
 *
 */
public class OOSDemo {
  public static void main(String[] args) throws IOException {
	 List<String> list = new ArrayList<String>();
	 list.add("家住在北京");
	 list.add("汉民");
	 list.add("其他信息");
	 
	 Person person = new Person("张三",22,'男',2000,list);
	 FileOutputStream fos = new FileOutputStream("person.obj");
	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	 /*
	  * void writeObject(Object o)
	  * ObjectOutputStream提供的方法
	  * 可以将给定的对象转换为一组字节后写出
	  */
	 oos.writeObject(person);
	 System.out.println("序列化完毕");
	 oos.close();
  }
}
