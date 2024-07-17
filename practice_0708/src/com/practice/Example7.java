package com.practice;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		// 세 정수 중 최대값
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("2. 정수를 입력하세요.");
		int b = sc.nextInt();
		System.out.println("3. 정수를 입력하세요.");
		int c = sc.nextInt();
		
		// 최대값
//		int max = (a > b && a > c ? a : b > c ? b : c);
		int d = a > b ? a : b;
		System.out.println(d > c ? d : c);
	}
}
