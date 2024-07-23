package com.review;

public class CarExample {
	public static void main(String[] args) {
		
		Driver me = new Driver();
		me.drive(new K5());
		
		// 익명 구현 객체
		me.drive(new Car() {

			@Override
			public void run() {
				System.out.println("모르는 차인데... 운전 가능합니다.");
			}
		});
		
		// @FunctionalInterface 이기 때문에 (함수 단 하나기 때문에) ()로 작성해도 됨
		me.drive(() -> System.out.println("이름없는 슈퍼카 운전함"));
		
		
		
		
	}
}
