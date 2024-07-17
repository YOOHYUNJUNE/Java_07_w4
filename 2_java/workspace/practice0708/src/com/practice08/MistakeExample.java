package com.practice08;

import java.util.Scanner;

public class MistakeExample {

	public static void main(String[] args) {
		// 정확한 계산을 위해서는 실수 타입 연산을 최대한 피해야 한다.
		
		Scanner sc = new Scanner(System.in);
		int apple = 1;
		double pieceUnit = 0.1;
		
		System.out.print("몇 조각을 드셨나요?: ");
		
		int number = sc.nextInt();
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}

}
