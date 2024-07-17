package com.practice;

import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		// 두 개의 정수를 받아 최대값
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("2. 정수를 입력하세요.");
		int b = sc.nextInt();
		
		// 최대값
		System.out.println(a > b ? a : b);
//		System.out.println(Math.max(a, b));
		
	}
}
