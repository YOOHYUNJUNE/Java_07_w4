package com.oop.inheritance2;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("아이폰", "스카이블루");
		System.out.println("와이파이 상태 : " + sp.wifi);
		
		sp.bell();
		sp.sendVoice("여보세요");
		sp.receiveVoice("야! 나 인균데~ 메일 좀 봐봐");
		sp.sendVoice("ㅇㅇ");
		sp.hangUp();
		
		sp.setWifi(!sp.wifi);
		sp.internet();
	}
}
