package com.oop.interface02;

public interface Vehicle {

	// 정적 상수 필드
	int MAX_SPEED = 200;
	
	// public static final
	// 퍼블릭 추상 메소드
	void start();
	void stop();
	
	// 디폴트 메소드
	default void displaySpeed(int speed) {
		if (speed > MAX_SPEED) {
			System.out.println("제한 속도 초과");
		} else {
			System.out.println("현재 속도 : " + speed + " km/h");
		}
	}
	
	default void doorOpen() {
		System.out.println("문이 열렸습니다.");
		log("7월 17일 문 열림");
	}
	
	
	static void service() {
		System.out.println("6개월마다 서비스 점검을 받으세요.");
	}
	
	
	private void log(String message) {
		System.out.println("log : " + message);
	}
	
	
}
