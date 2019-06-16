package se.day09;
/**
 * 有效的减少同步范围可以提高并发效率
 * @author sige
 *
 */
public class SyncDemo2 {
//  private static Object obj = new Object();
 
  public static void main(String[] args) {
	  final SyncDemo2 demo = new SyncDemo2();
	  Thread t1 = new Thread(){
		  public void run(){
			  demo.buy(getName());
		  }
	  };
	  
	  Thread t2 = new Thread(){
		  public void run(){
			  demo.buy(getName());
		  }
	  };
	  
	  t1.start();
	  t2.start();
	 
  }
  
  public void buy(String name){
	  System.out.println(name+"正在挑衣服");
	  try {
		Thread.sleep(5000);
	  } catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(name+"挑完衣服了");
	//多线程看到的锁对象必须是同一个对象,否则起不到效果的
	//如果一个synchronized块在一个非静态方法中，通常锁对象写的是this
	synchronized(this){
		System.out.println(name+"准备试衣服");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"试完衣服了");
	}
	System.out.println(name+"结账。");
	
  }
  
  
}
