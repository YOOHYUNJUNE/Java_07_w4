package com.thread3;

public class ThreadB extends Thread {
	
	String fileName;

	@Override
	public void run() {
		Thread.currentThread().setName("다운로드");
		String name = Thread.currentThread().getName();
		System.out.println(name + " 시작");
		
		for (int i=0; i<=100; i+=10) {
			System.out.println("다운로드 : " + i + "%");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		fileName = "이클립스 설치파일";
		System.out.println(name + " 끝");
	}
}
