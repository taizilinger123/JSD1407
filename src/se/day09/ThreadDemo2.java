package se.day09;
/**
 * 第二种创建线程的方式
 * 定义线程体Runnable
 * @author sige
 *
 */
public class ThreadDemo2 {
   public static void main(String[] args) {
	   Runnable runn1 = new MyRunnable1();
	   Runnable runn2 = new MyRunnable2();
	   
	   Thread t1 = new Thread(runn1);
	   Thread t2 = new Thread(runn2);
	   
	   t1.start();
	   t2.start();
   }
}

class MyRunnable1 implements Runnable{
	public  void  run(){
		for(int i=0;i<1000;i++){
			 System.out.println("你是谁啊");
		}
	}
}

class MyRunnable2 implements Runnable{
	public  void  run(){
		for(int i=0;i<1000;i++){
			 System.out.println("我是修水管的");
		}
	}
}