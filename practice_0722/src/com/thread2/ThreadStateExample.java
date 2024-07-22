package com.thread2;

public class ThreadStateExample {
	public static void main(String[] args) {
		// 스레드 상태
		// NEW : 스레드 생성 후, start 전
		// RUNNABLE : start 후, 실행 준비가 된 상태(실행 중 일수도, 대기일 수도)
		// TERMINATED : 실행 종료
		
		Thread.State state; // 중첩 enum 클래스
		
		Thread thread = new Thread() {

			@Override
			public void run() {
				for (int i=0; i<1_000_000_000; i++) {}
			}
		};
		
		state = thread.getState(); // 만든 스레드의 상태를 가져옴
		System.out.println("스레드 상태 1 : " + state); // "NEW"
		
		thread.start(); // 스레드 시작
		state = thread.getState(); // 상태를 또 가져옴
		System.out.println("스레드 상태 2 : " + state); // "RUNNABLE"

		try {
			thread.join(); // (자원 몰빵) 해당 작업 스레드가 CPU를 모두 사용하도록 메인 스레드 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		state = thread.getState(); // 상태를 또 가져옴
		System.out.println("스레드 상태 3 : " + state); // "TERMINATED"
		
	}
}
