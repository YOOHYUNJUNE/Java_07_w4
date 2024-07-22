package com.anonymous;

public class HumanExample {
	public static void main(String[] args) {
		
//		Human h = new Human();
//		h.work();
		
//		Human h = new Hunter();
//		h.work();
		
//		// 익명 자식 객체
//		Human dev = new Human() {
//			@Override
//			public void work() {
////				super.work();
//				System.out.println("사냥합니다.");
//			}
//		};
//		dev.start();
		
//		Human korean = new Human(new HumanServiceImpl());
//		korean.start();
		
		Human american = new Human(new HumanService() {
			
			@Override
			public void run() {
				System.out.println("say, Hello");
			}
		});
		american.start();
		
		
		Human french = new Human(() -> System.out.println("bon jour"));
		french.start();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
