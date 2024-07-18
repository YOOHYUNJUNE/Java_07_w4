package com.anonymous.implement;

public class HomeExample {
	public static void main(String[] args) {
		
		Home home = new Home();
		home.play();
		
		System.out.println();
		
		home.useSwitch();
		
		System.out.println();
		
		// 매개 변수 값으로 인터페이스 구현 객체 대입
//		home.exercise(new RunningMachine());
		
		// 매개 변수 값으로 인터페이스 구현 객체 대입
		home.exercise(new GymLink() {
			
			@Override
			public void use() {
				System.out.println("팔굽혀펴기를 합니다.");
				
			}
		});
		
	}
}
