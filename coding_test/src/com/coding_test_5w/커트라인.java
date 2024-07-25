package com.coding_test_5w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 커트라인 {
	public static void main(String[] args) {
		
		// 응시자 수 N명
		// 상 받는 사람 k명
		// 학생의 점수 x점
		
		// N명 중 k명이 상을 받음.
		// x점 들 중 k순위가 커트라인
		
		// 커트라인은 몇 점인가
		
		Scanner sc = new Scanner(System.in);
		
		// 응시자 수
		System.out.println("응시자 수를 입력하세요.");
		int n = sc.nextInt();
		
		// 상 받는 사람 수 = 커트라인 순위
		System.out.println("수상하는 학생 수를 입력하세요.");
		int k = sc.nextInt();
		
		// 학생들의 점수 배열에 넣기
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("학생들의 점수를 입력하세요.");
			int x = sc.nextInt();
			arr[i] = x;
		}
		
		// n = 5
		// x = 100, 90, 80, 70, 60
		// k = 2
		// 커트라인 = 90
		
		// 점수들을 배열 안에 넣고, 정렬하고, k번째 수를 반환?

		
		// 점수 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[n-k]);
		
		
		
		
		
		
		
		
	}
}
