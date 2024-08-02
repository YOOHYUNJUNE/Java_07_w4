package com.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class ServerExample {
	
	// 서버 소켓
	private static ServerSocket ss = null;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("서버를 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		startServer();
		
		while(true) {
			if (sc.nextLine().toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		stopServer();
		
		
	}

	
	
	// 서버 켜기
	
	private static void startServer() {
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					ss = new ServerSocket(8080);
					System.out.println("[서버] 서버 시작");
					
					while (true) {
						System.out.println("[서버] 요청을 기다리는 중...");
						Socket s = ss.accept();
						
						InetSocketAddress isa = (InetSocketAddress) s.getRemoteSocketAddress();
						String clientIP = isa.getHostString();
						System.out.println("[서버]" + clientIP + "의 연결 요청 수락");
						
						DataInputStream dis = new DataInputStream(s.getInputStream());
						String msg = dis.readUTF();
						
						String name = "[사용자" +  clientIP.split(".")[3] + "] ";
						
						System.out.println(name + msg);
						
						
						s.close();
						System.out.println("[서버]" + clientIP + "의 연결 종료");
						
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			} // run
			
		}; // thread
		thread.start();
	
		
	} // startServer
	
	
	
	// 서버 끄기
	
	private static void stopServer() {
		try {
			ss.close();
			System.out.println("[서버] 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // stopServer
	
	
	
	
}
