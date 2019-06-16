package se.day10;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端应用程序
 * @author sige
 *
 */
public class Server {
   //运行在服务端的Socket
	private ServerSocket server;
	/**
	 * 构造方法，用于初始化服务端
	 * @throws IOException 
	 */
	public Server() throws Exception{
	   try {
		/*
		 * 创建ServerSocket时需要指定服务端口 
		 */
		System.out.println("初始化服务端");
		server = new ServerSocket(8088);
		System.out.println("服务端初始化完毕");
	   } catch (Exception e) {
		    e.printStackTrace();
			throw e;
	   }
	}
	/**
	 * 服务端开始工作的方法
	 */
	public void  start(){
		try {
			/*
			 * ServerSocket的accept方法
			 * 用于监听8088端口，等待客户端的连接
			 * 该方法是一个阻塞方法，直到一个客户端
			 * 连接，否则该方法一直阻塞。若一个客户端
			 * 连接了，会返回该客户端的Socket
			 */
			System.out.println("等待客户端连接...");
			Socket socket = server.accept();
			System.out.println("客户端连接了");
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		Server server;
		try {
			server = new Server();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("服务端初始化失败");
		}
		
	}
	
}
