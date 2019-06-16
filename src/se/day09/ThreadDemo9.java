package se.day09;
/**
 * join可以使线程同步
 * @author sige
 *
 */
public class ThreadDemo9 {
  //表示图片是否下载完毕
  public static boolean isFinish;
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
	  }
  };
  /*
   * main方法中定义了一个内部类show,
   * 该内部类中若想引用main方法中的其他
   * 局部变量，那么这个变量必须是final的
   */
  Thread show = new Thread(){
	  public void run(){
		  System.out.println("show:开始显示图片..");
		  //这里应当等待下载线程将图片下载完毕
		  try {
			download.join();
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
//  解决多线程并发安全问题的办法是：将异步的操作变成同步的,
//  产生多线程并发安全的原因是:多线程并同发操作意数据
  }
}
