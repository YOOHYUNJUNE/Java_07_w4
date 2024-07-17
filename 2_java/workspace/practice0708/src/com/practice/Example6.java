package com.practice;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.print("2. 정수를 입력하세요.");
		int num2 = sc.nextInt();
		int max = (num1 > num2 ? num1 : num2);
		System.out.println("최대값 : " + max); // 최대값 : _
		// System.out.println("최대값 : " + Math.max(num1, num2)); // 최대값 : _
	}
}
