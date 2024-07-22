package com.thread4;

public class ThreadLoopExample {
	public static void main(String[] args) {
		
//		Thread threadTest = new Thread();
		
		ThreadLoop thread0 = new ThreadLoop();
		ThreadLoop thread1 = new ThreadLoop();

		thread0.setName("첫 번째 스레드");
		thread1.setName("두 번째 스레드");
		
		thread0.start();
		thread1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread0.work = false;
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread0.work = true;
		
		
		
	}
}
