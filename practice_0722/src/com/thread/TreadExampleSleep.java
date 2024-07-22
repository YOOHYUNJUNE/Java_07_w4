package com.thread;

public class TreadExampleSleep {
	public static void main(String[] args) {
		
		// Thread thread = new Thread(/* Runnable 인터페이스 */ new Task());
//		Thread thread = new Thread(new Task());

		Thread thread = new Thread(new Runnable() {

			// 스레드 슬립 : 스레드 일시 정지, 딜레이 (정적 메소드)
			
			@Override
			// 익명개체로 구현시, Task 파일이 필요 없음
			public void run() {
				for (int i=5; i>0; i--) {
					System.out.println("스레드 " + i);
					
					// 스레드 슬립
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("메인 " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
