package com.practice08;

import java.util.Scanner;

public class MistakeExample2 {
	public static void main(String[] args) {
		// 정확한 계산을 위해, 실수 타입 연산을 삼가야 함.
		 Scanner sc = new Scanner(System.in);
		 
		 int apple = 1;
		 double pieceUnit = 0.1;
		 
		 // 10진수 1 = 2진수 1
		 // 10진수 0.5 = 2진수 0.1
		 // 10진수 0.25 = 2진수 0.01
		 
		 System.out.println("몇 조각을 드셨나요? : ");
		 int number = sc.nextInt();
		 
		 double result = apple - number * pieceUnit;
		 System.out.println("사과 1개에서 남은 양 : " + result);
	}
}
