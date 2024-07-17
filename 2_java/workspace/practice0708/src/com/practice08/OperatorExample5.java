package com.practice08;

import java.util.Scanner;

public class OperatorExample5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 글자만 입력: ");
		String str = sc.nextLine();
		char c = str.charAt(0);
		
		if ((65 <= c) && (c <= 90)) {
			System.out.println("대문자이군요!");
		}
		if ((97 <= c) && (c <= 122)) {
			System.out.println("소문자이군요~");
		}
		if ((48 <= c) && (c <= 57)) {
			System.out.println("숫자이군요 :D");
		}
		
		System.out.println("숫자 하나를 써주세요");
		int i = sc.nextInt();
		// 만약에 i가 2의 배수이거나 3의 배수라면,
		if (i % 2 == 0 || i % 3 == 0) {
			// "2 또는 3의 배수이군요~" 라고 출력!!!
			System.out.println("2 또는 3의 배수이군요~");
		}
	}

}

