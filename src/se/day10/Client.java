package se.day10;

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
