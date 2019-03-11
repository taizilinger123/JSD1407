package se.day02;

public class Teacher extends Person{
	private String name;
	private int age;
	private String gender;
    public static void main(String[] args) {
       Teacher p = new Teacher();
       p.name = "苍老师";
       p.age = 30;
       p.gender = "男";
       /*
        * System.out.println(Object obj);
        * 将给定对象的toString()方法返回的字符串输出到控制台
        */
       System.out.println(p);
       
       Teacher p2 = new Teacher();
       p2.name = "苍老师";
       p2.age = 30;
       p2.gender = "男";
       System.out.println(p==p2);//false
       System.out.println(p.equals(p2));//true
       
       Person o = p;
       String str = o.toString();
       System.out.println(str);
  }
    
	public String toString() {		
		return "name:"+name+",age:"+age+",gender:"+gender;
	}    
	
	/**
	 * 该方法用来判断当前对象与给定对象"长的像不像"
	 * 比内容(属性)
	 * 如果用equals时一定要重写equals不然没意义
	 */
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(obj == this){
			return true;
		}
		if(obj instanceof Teacher){
			Teacher t = (Teacher)obj;
			return t.name.equals(this.name)
				   &&
				   t.age == this.age
				   && 
				   t.gender.equals(this.gender);
		}
		return false;
	}
} 
