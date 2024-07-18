package com.anonymous.inheritance;

public class Car {

	//필드
	private Tire frontLeft = new Tire();
	private Tire frontRight = new KumhoTire(); // 금호
	private Tire rearLeft = new HankookTire(); // 한국
	private Tire rearRight = new Tire() { // 익명 객체
		@Override
		public void roll() {
			System.out.println("3. 익명 타이어가 굴러간다~");
		}
	};
	
	public void run() {
//		Tire tire = new KumhoTire();
//		tire.roll();
		frontLeft.roll();
		frontRight.roll();
		rearLeft.roll();
		rearRight.roll();
	}
	
	
	public void start() {
//		Engine e = new Engine();
//		Engine e = new SuperEngine();
		
		// 로컬 변수에 익명 자식 객체를 대입해서 사용
		Engine e = new Engine() {
			@Override
			void use() {
				System.out.println("익명 엔진");
			}
		};
		e.use();
	}
	
	
	public void curve(Handle h) {
		h.turn();
	}
	
	
	
	
	
}
