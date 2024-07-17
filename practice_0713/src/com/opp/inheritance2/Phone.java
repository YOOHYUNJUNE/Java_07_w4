package com.opp.inheritance2;

public class Phone {
	public String model, color; // 상속을 위해서 필수는 아님(디폴트나 프로텍트도 가능 / private는 안됨)
	
	// 기본 생성자
	public Phone() {
		// 자식 출력시 함께 출력
		System.out.println("Phone 기본 생성자");
	}
	public Phone(String model, String color) {
		// 자식 출력시 함께 출력
		System.out.println("Phone 기본 생성자(모델, 색상)");
	}
	
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("본인 : " + message);
	}
	
	public void receiveVoice(String message) {
		System.err.println("상대방 : " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
	
}
