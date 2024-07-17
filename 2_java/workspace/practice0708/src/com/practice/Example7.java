package com.practice;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 정수를 입력하세요.");
		int a = sc.nextInt();
		System.out.print("2. 정수를 입력하세요.");
		int b = sc.nextInt();
		System.out.print("3. 정수를 입력하세요.");
		int c = sc.nextInt();
		
		int max = (a > b && a > c ? a : b > c ? b : c );
		System.out.println("최대값 : " + max); // 최대값 : _
	
		// int d = (a > b ? a : b);
		// System.out.println("최대값 : " + (d > c ? d : c)); // 최대값 : _
	}
}
