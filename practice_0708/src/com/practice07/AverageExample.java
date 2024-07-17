package com.practice07;

import java.util.Scanner;

public class AverageExample {
	public static void main(String[] args) {
		int sum = 0;
		// 3명의 수학점수를 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 수학점수 : ");
		String math1 = sc.nextLine();
		
		System.out.println("2번 수학점수 : ");
		String math2 = sc.nextLine();
		
		System.out.println("3번 수학점수 : ");
		String math3 = sc.nextLine();
		
		// int sum으로 하면 이미 선언한 sum이 있으므로 오류
		sum = Integer.parseInt(math1) + Integer.parseInt(math2) + Integer.parseInt(math3);
		// 평균에 소수점이 존재할 수 있으므로 double
		double average = (double) sum / 3;
		
		System.out.println("총 합계 : " + sum);
		System.out.println("평균 : " + average);
		
	}
}
