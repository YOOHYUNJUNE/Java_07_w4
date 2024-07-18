package com.exception;

public class ExceptionExample1 {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		
		
//		try { // runtime exception : 오류 발생 시 이후 결과가 출력되지 않음
			printLength("exception");
			printLength("안녕하세요");
			printLength(null); 
			printLength("exception");

//		} catch (NullPointerException e) {
			
//		}
		System.out.println("프로그램 종료");
		
	}
	
	private static void printLength(String data) {
		try {
			int len = data.length();
			System.out.println("글자 수 : " + len);			
		} catch (NullPointerException e) {
			// 예외 출력 방법 3가지
//			e.printStackTrace(); // 에러 내용 출력
//			System.out.println(e.getMessage()); // 주요 내용 출력 
			System.out.println(e.toString()); // 주요 내용과 출처 출력
		}
		
		

	}
		
		
		
}
