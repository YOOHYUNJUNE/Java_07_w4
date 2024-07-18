package com.anonymous.implement;

public class Home {

	// 필드에 인터페이스 구현 객체 대입
//	private RemoteControl rc = new Television();
	
	// 필드에 인터페이스 익명 구현 객체 대입
	private RemoteControl rc = new Television() {

		@Override
		public void turnOn() {
			System.out.println("(익명) 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("(익명) 끕니다.");
		}
		
	};	
	
	
	public void play() {
		rc.turnOn();
	}
	
	
	// 로컬 변수
	public void useSwitch() {
		// 로컬변수에 인터페이스 구현 객체 대입
//		Switch s = new BathRoomSwitch() {
		Switch s = new Switch() {
			@Override
			public void click() {
				System.out.println("두꺼비집을 내립니다.");
			}
		};
		s.click();
	}
	
	public void exercise(GymLink g) {
		g.use();
	}
	
	
	
	
	
	
	
}
