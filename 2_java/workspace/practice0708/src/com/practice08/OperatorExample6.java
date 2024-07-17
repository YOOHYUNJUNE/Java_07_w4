package com.practice08;

import java.util.Scanner;

public class OperatorExample6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력:");
		int score = sc.nextInt();
		
		// 만약 90점 초과면 '수'
		// 80점 초과면 '우'
		// 70점 초과면 '미'
		// 60점 초과면 '양'
		// 나머지 '가'
		char grade = (score > 90) ? '수'
				: (score > 80) ? '우'
				: (score > 70) ? '미'
				: (score > 60) ? '양'
				: '가';
		System.out.println(score + "점은 [" + grade + "]입니다.");
	}

}

