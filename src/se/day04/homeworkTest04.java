package se.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * 练习第7题
 * @author sige
 *
 */
public class homeworkTest04 {
   public static void main(String[] args) {
	 List<Emp> emps = new ArrayList<Emp>();
	 emps.add(new Emp("Terry", 25, 'm', 6000));
	 emps.add(new Emp("Allen", 21, 'f', 4000));
	 emps.add(new Emp("Smith", 23, 'm', 3000));
	 System.out.println(emps);
	 /*
	  * 何时使用匿名内部类：
	  * 当我们需要用到一个实例，而该实例所属的类
	  * 需要实现一个接口或者继承一个类，并且该实例
	  * 仅在这里用一次，不会在其他地方使用时，我们
	  * 就应当选取使用匿名内部类的形式创建实例。
	  */
	 Comparator<Emp> com = new Comparator<Emp>(){
		public int compare(Emp o1, Emp o2) {
			return o1.salary-o2.salary;
		}
		 
	 };
	 
	 Collections.sort(emps,com);
	 System.out.println(emps);
   }
}

class Emp{
	public String name;
	public int age;
	public char gender;
	public int salary;
	public Emp(String name, int age, char gender, int salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	public String toString() {
		return name+","+age+","+gender+","+salary;
	}
	
	
}