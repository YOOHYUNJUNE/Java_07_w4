package com.system;

public class MeasureRuntimeExample {
	public static void main(String[] args) {
		
		// 나노초 단위(1/1_000_000_000초) 시간 반환 : 정밀함 (시스템 무관)
		System.out.println(System.nanoTime());
		
		// 밀리초 단위(1/1000초) 시간 반환 : 현재 날짜와 시간 (시스템 기준)
		// 시간 기록, 로그
		System.out.println(System.currentTimeMillis());
		
		long start = System.nanoTime();
		
		// 복잡한 연산 수행
		int sum = 0;
		for (int i=0; i<=1_000_000; i++) {
			sum += i;
		}
		
		// 연산 종료 시간
		long end = System.nanoTime();
		
		// 걸린 시간
		long result = end - start;
		
		System.out.println(result + " 나노초 소요");
		
		
		
		
		
		
	}
}
