package com.thread;

public class TreadExample1 {
	public static void main(String[] args) {
		
		// Thread thread = new Thread(/* Runnable 인터페이스 */ new Task());
//		Thread thread = new Thread(new Task());

		Thread thread = new Thread(new Runnable() {

			@Override
			// 익명개체로 구현시, Task 파일이 필요 없음
			public void run() {
				for (int i=1000; i>0; i--) {
					System.out.println("스레드 " + i);
				}
				
			}
			
		});
		
		thread.start();
		
		for (int i=0; i<1000; i++) {
			System.out.println("메인 " + i);
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
