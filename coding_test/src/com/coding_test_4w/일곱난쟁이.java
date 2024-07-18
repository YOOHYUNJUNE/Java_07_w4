package com.coding_test_4w;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성
		int[] arr = new int[9];
		
		// 난쟁이 9명 키 입력
		for (int i=0; i<9; i++) {
			int height = sc.nextInt();
			arr[i] = height;
		}
		
		
		// 버블정렬로는 너무 오래 걸릴 것 같다...
		
		// 난쟁이 7명 키의 합 = 100
		int sum = 0;
		for (int i=0; i<9; i++) {
			sum += arr[i];
		}
		
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
		
		
		
		
	}
}
