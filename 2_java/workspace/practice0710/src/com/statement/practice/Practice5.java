package com.statement.practice;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한자리 정수 입력 : ");
		int inputNum = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % inputNum == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
