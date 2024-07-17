package com.practice07;

import java.util.Scanner;

public class AverageExample {

	public static void main(String[] args) {
		int sum = 0;
		// 3명의 수학점수를 입력받을거에요!
		Scanner sc = new Scanner(System.in);
		System.out.print("1번 수학점수 : ");
		int math1 = sc.nextInt();
		sum += math1;
		
		System.out.print("2번 수학점수 : ");
		int math2 = sc.nextInt();
		sum += math2;

		System.out.print("2번 수학점수 : ");
		int math3 = sc.nextInt();
		sum += math3;
	
		System.out.println("총 합계 : " + sum);
		double average = (double) sum / 3;
		System.out.println("평균 : " + average);		
	}

}
