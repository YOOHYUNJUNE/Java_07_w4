package com.ip.check;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPExample {
	public static void main(String[] args) {
		
		// IP 주소 확인 시 java.net 패키지의 InetAddress 클래스 사용
		try {
			InetAddress local = InetAddress.getLocalHost();
			String myIP = local.getHostAddress();
			System.out.println("내 IP 주소 > " + myIP);
			
			InetAddress[] remoteArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : remoteArr) {
				String naverIP = remote.getHostAddress();
				System.out.println("네이버 IP 주소 > " + naverIP);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
