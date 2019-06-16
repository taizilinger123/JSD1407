package se.day09;
/**
 * 后台线程，守护线程
 * 特点：
 *   当进程中所有前台线程都结束时，后台线程结束，无论后台线程是否还在运行
 * @author sige
 *
 */
public class ThreadDemo7 {
   public static void main(String[] args) {
	   //rose 扮演者：前台线程
	   Thread rose = new Thread(){
		   public void run(){
			   for(int i=0;i<10;i++){
				   System.out.println("rose:let me go!");
				   try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			   }
			   System.out.println("rose:AAAAAAaaaaaa...");
			   System.out.println("音效：噗通");
		   }
	   };
	   
	   //jack 扮演者：后台线程
	   Thread jack = new Thread(){
		   public void run(){
			   while(true){
				   System.out.println("jack:you jump!i jump!");
				   try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			   }
		   }
	   };
	   
	   rose.start();
	   //设置后台线程应在start方法之前调用
	   jack.setDaemon(true);
	   jack.start();
       //System.out.println("main方法执行完了");
	   //while(true);
	   
   }
}
