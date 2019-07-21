package se.day10;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
/**
 * 客户端应用程序
 * @author sige
 *
 */
public class Client {
  //socket,用于连接服务端的ServerSocket
  private Socket socket;
  /**
   * 客户端构造方法，用于初始化客户端
 * @throws IOException 
   */
  public Client() throws Exception{
	  
	  try {
		/*
		 * 创建Socket对象时，就会尝试根据给定的地址与端口
		 * 连接服务端。所以，若该对象创建成功，说明与服务端
		 * 连接正常。
		 */
		System.out.println("正在连接服务端...");
		socket = new Socket("localhost",8088);
		System.out.println("成功连接服务端");
	}catch (Exception e) {
		throw e;
	}
  }
  /**
   * 客户端启动方法
   */
  public void start(){
	  try {
		 /*
		  * 可以通过Socket的getOutputStream()
		  * 方法获取一条输出流，用于将信息发送
		  * 至服务端 
		  */
	     OutputStream  out = socket.getOutputStream();
	     /*
	      * 使用字符流来根据指定的编码集将字符串
	      * 转换为字节后，在通过out发送给服务端
	      */
	     OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
	     /*
	      * 将字符流包装为缓冲字符流，就可以按行
	      * 为单位写出字符串了
	      */
	     PrintWriter pw = new PrintWriter(osw);
	     
	     pw.println("你好!服务端!");
	     pw.flush();
	     
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  public static void main(String[] args) {
	try {
		Client client = new Client();
		client.start();
	} catch (Exception e) {
	    e.printStackTrace();
		System.out.println("客户端初始化失败");
	}
  }
}
