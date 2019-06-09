package se.day08;

public class Person {
   private int age;
   
   public int getAge(){
	   return age;
   }
   public void setAge(int age) throws IllegalAgeException{
	   if(age<=0||age>100){
		   throw new IllegalAgeException("不是人类的年龄");
//		   throw new RuntimeException("不是人类的年龄");
//		   通常情况下方法中throw了一个异常实例，我们则必须处理该异常，处理的方式有2种，
//		 1.为你的throw添加try...catch...
//		 2.在当前方法上声明该类异常的抛出，以便于通知调用者处理该异常，调用者依然遵循这2者
	   }
	   this.age = age;
   }
   
   public static void main(String[] args){
	  Person p = new Person();
	  try {
		p.setAge(50);
	} catch (IllegalAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
