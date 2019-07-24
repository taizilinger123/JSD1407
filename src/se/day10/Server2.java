package se.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端应用程序
 * @author sige
 *
 */
public class Server2 {
   //运行在服务端的Socket
	private ServerSocket server;
	/**
	 * 构造方法，用于初始化服务端
	 * @throws IOException 
	 */
	public Server2() throws Exception{
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
			/*
			 * 通过socket获取远端的地址信息
			 * 对于服务端而言，远端就是客户端了
			 */
			InetAddress address = socket.getInetAddress();
			//获取远端计算机的IP地址
			String ha = address.getHostAddress();
//			address.getCanonicalHostName();
			//获取客户端的端口号
			int port = socket.getPort();
			System.out.println(ha+":"+port+" 客户端连接了");
			
			/*
			 * 通过刚刚连上的客户端的Socket获取
			 * 输入流，来读取客户端发送过来的信息
			 */
		InputStream in = socket.getInputStream();
		/*
		 * 将字节输入流包装为字符输出流，这样
		 * 可以指定编码集来读取每一个字符
		 */
		InputStreamReader isr = new InputStreamReader(in,"UTF-8");
		/*
		 * 将字符流转换为缓冲字符输入流
		 * 这样就可以以行为单位读取字符串了
		 */
		BufferedReader br = new BufferedReader(isr);
		
		//读取客户端发送过来的一行字符串
		/*
		 * 读取客户端发送过来的信息这里
		 * windows与linux存在一定的差异：
		 * linux:当客户端与服务端断开连接后
		 *       我们通过输入流会读取到null
		 *       但这是合乎逻辑的，因为缓冲流的
		 *       readLine()方法若返回null就
		 *       表示无法通过该流再读取到信息。
		 *       参考之前服务文本文件的判断。
		 *       
		 *windows:当客户端与服务端断开连接后
		 *        readLine()方法会抛出异常。
		 */
		String message = null;
		while((message = br.readLine())!=null){
		       System.out.println("客户端说："+message);
		}
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		Server2 server;
		try {
			server = new Server2();
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("服务端初始化失败");
		}
		
	}
	
	/**
	 * 服务端中的一个线程，用于与某个客户端交互。
	 * 使用线程的目的是使得服务端可以处理多客户端了。
	 * @author sige
	 *
	 */
	class ClientHandler implements  Runnable{
		//当前线程处理的客户端的Socket
		private Socket socket;
		/**
		 * 根据给定的客户端的Socket,创建线程体
		 * @param socket
		 */
		public ClientHandler(Socket socket){
			this.socket = socket;
		}
		/**
		 * 该线程会将当前Socket中的输入流获取
		 * 用来循环读取客户端发送过来的消息。
		 */
		public void run(){
			try{			
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String message = null;
				while((message = br.readLine())!=null){
				       System.out.println("客户端说："+message);
				}
			}catch (Exception e) {
				//在Windows中的客户端，报错通常是因为客户端断开了连接
				
			}finally {
				/*
				 * 无论是linux用户还是windows
				 * 用户，当与服务端断开连接后
				 * 我们都应该在服务端与客户端
				 * 断开连接
				 */
				try {
					socket.close();
				} catch (IOException e) {
				}
				System.out.println("一个客户端下线了...");
			}
		}
	}
	
	
}
