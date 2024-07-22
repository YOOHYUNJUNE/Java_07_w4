package com.thread1;

public class ThreadExample {
	public static void main(String[] args) {
		
		// 1. Thread의 생성자 매개변수로 Runnable 인터페이스 사용 
		// 2. Thread의 자식 객체를 만들어 사용
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// 현재 해당되는 쓰레드 가져오기
				Thread thread = Thread.currentThread();
				thread.setName("Upload");
				String threadName = thread.getName();
				for (int i=0; i<=100; i+=10) {
					try {
						Thread.sleep(750);
						System.out.println(threadName + ": " + i + "%");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		
		Thread thread2 = new Thread() {
			
			@Override
			public void run() {
				// 현재 해당되는 쓰레드 가져오기
				Thread thread = Thread.currentThread();
				thread.setName("Download");
				String threadName = thread.getName();
				for (int i=0; i<=100; i+=10) {
					try {
						Thread.sleep(500);
						System.out.println(threadName + ": " + i + "%");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		
		// 메인 쓰레드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		
		thread1.start();
		thread2.start();
		
		
		
		
		
		
	}
}
