package com.coding_test_4w;

import java.util.Arrays;
import java.util.Scanner;

public class 모의고사 {
	public static void main(String[] args) {
		
		// 1번 학생 : 1 2 3 4 5 반복
		// 2번 학생 : 2 1 2 3 2 4 2 5 반복
		// 3번 학생 : 3 3 1 1 2 2 4 4 5 5 반복
		
		// 문제 배열 주어질때, 가장 많이 맞춘 사람(중복시 전부 표시)
		// 문제 답은 1 ~ 5
		
		Scanner sc = new Scanner(System.in);
		// 배열 크기 선정
		System.out.println("배열 크기를 정해주세요.");
		int n = sc.nextInt();
		
		int[] sol = new int[n];
		for (int i=0; i<n; i++) {
			
			// 직접 입력
			int number = sc.nextInt();
			// 정답 1~5 랜덤 입력
//			int number = (int) (Math.random()*5 + 1);
			sol[i] = number;
		}
		System.out.println(Arrays.toString(sol));
		
		// 1번 학생
		int[] one = {1, 2, 3, 4, 5};
		
		// 2번 학생
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};

		// 3번 학생
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		// 1. 정답 배열 길이가 학생보다 짧으면, 학생 = 학생[n] 
		// Arrays.copyOf(arr, n)
		
		// 2. 잘린 학생 배열을 다시 정답 배열에 대입
		// 
		
		System.out.println(sol == one);
		
		
		
		
	}
}
