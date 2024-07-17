package com.statement.practice;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		// 1~100 합
		// Scanner에서 1자리 정수형을 받아, 입력 받은 수의 배수만 더해야 함
		// 5 -> 5+10+15+20...+100
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i % num == 0) { // 입력값 배수의 합
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
