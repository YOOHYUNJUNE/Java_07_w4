package com.coding_test_4w;

import java.util.Arrays;
import java.util.Scanner;

public class 진료순서정하기 {
	public static void main(String[] args) {
		
		// 배열의 값 큰 수부터 1씩 부여
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성
		System.out.println("배열 길이 설정");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		for (int i=0; i<len; i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 순서를 출력할 배열
		int [] answer = new int[len];
		
		for (int i=0; i<len; i++) {
			// 순서
			int rank = len;
			for (int j=0; j<len; j++) {
				if (arr[j] < arr[i]) {
					rank--;
				}
			}
			answer[i] = rank;
		}
		System.out.println("순서");
		System.out.println(Arrays.toString(answer));
		
		

		
		
	}

}
