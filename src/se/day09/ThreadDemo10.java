package se.day09;
/**
 * 线程协同工作 
 * @author sige
 *
 */
public class ThreadDemo10 {
  public static boolean isFinish;
  public static Object obj = new Object();
  public static void main(String[] args) {
	  //下载线程
	  final Thread download = new Thread(){
		  public void run(){
			  System.out.println("down:开始下载图片..");
			  for(int i=0;i<=100;i++){
				  System.out.println("down:已完成"+i+"%");
				  try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			  }
			  System.out.println("down:图片下载完毕");
			  isFinish = true;
			  /*
			   * 当图片下载完毕，就应当通知显示图片的线程开始工作了
			   */
			  synchronized (obj) {
				  //多个线程调用wait解除wait就用notifyAll(),notify()方法只会随机解除一个在当前对象上等待的线程
				  //我们调用哪个对象的wait或notify，就应当对当前方法加锁，锁对象就是当前对象
			      obj.notifyAll();
			  }
			  
			  System.out.println("down:开始下载附件..");
			  for(int i=0;i<=100;i++){
				  System.out.println("down:已完成"+i+"%");
				  try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			  }
			  System.out.println("down:附件下载完毕");
			  
		  }
	  };
	  
	  Thread show = new Thread(){
		  public void run(){
			  System.out.println("show:开始显示图片..");
			  //这里应当等待下载线程将图片下载完毕
			  try {
				//download.join();
				  //在obj对象上等待
				  synchronized (obj) {
					  obj.wait();
				}
			} catch (InterruptedException e) {
			}
			  if(!isFinish){
				  throw new RuntimeException(" 图片没有找到");
			  }
			  System.out.println("show:显示图片完毕");
		  }
	  };
	  
	  download.start();
	  show.start();
  }
}
