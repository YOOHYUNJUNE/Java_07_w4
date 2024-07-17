package com.practice08;

import java.util.Scanner;

public class OperatorExample5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("한 글자 입력 : ");
//		String str = sc.nextLine();
		
//		char c = str.charAt(0); // 0번째 글자
//		
//		if((65 <= c) && (c <= 90)) {
//			System.out.println("대문자");
//		}
//		if ((97 <= c) && (c <= 122)) {
//			System.out.println("소문자");
//		}
//		if ((48 <= c) && (c <= 57)) {
//			System.out.println("숫자");
//		}
		
		System.out.println("숫자 하나를 써주세요.");
		int i = sc.nextInt();
		// i가 2 또는 3의 배수라면 "2 또는 3의 배수" 출력
		if((i % 2 == 0) && (i % 3 == 0)) {
			System.out.println("2 와 3의 공배수");
		} else {
			System.out.println("...");
		}
			
				
	}
}
