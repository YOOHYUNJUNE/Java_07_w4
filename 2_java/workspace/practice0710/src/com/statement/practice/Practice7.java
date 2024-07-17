package com.statement.practice;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int sum = 0;
//		// 자연수 입력
//		while (true) {
//			System.out.print("자연수 입력 : ");
//			num = sc.nextInt();
//			if (num > 0)
//				break;
//		}
//		// 총합 출력
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 " + num + "까지의 총합 : " + sum);

		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		// 음수 및 0을 입력한 경우 생각
		do {
			System.out.print("정수를 입력해주세요: ");
			num = sc.nextInt();
		} while (num <= 0);
		
		for (int i = 0; i <= num; i++) {
			sum += 1;
		}
		
		System.out.println("총합: " + sum);
		sc.close();

//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		while(true) {
//			System.out.print("정수 입력: ");
//			int num = sc.nextInt();
//			if (num >= 1) {
//				for(int i = 1; i <= num; i++) {
//					sum += i;
//				}
//				break;
//			}
//		}
//		System.out.println(sum);
	}

}
