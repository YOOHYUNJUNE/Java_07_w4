package com.coding_test_4w;

import java.util.Arrays;
import java.util.Scanner;

public class Remain {
	public static void main(String[] args) {
		
		// int n 10개를 입력 받음
		// int a = n % 42
		// 서로 다른 값이 몇개 있는지 if (a != b) { number++ }
		
		Scanner sc = new Scanner(System.in);
		
		// 서로 다른 수의 개수
		int another = 0;
		
		// 배열
		int[] arr = new int[10];
		
		// 입력받을 10개 수
		for (int i=0; i<10; i++) {
			System.out.println("수 10개를 입력");
			int n = sc.nextInt();
			arr[i] = n;

		}
		
		for (int i=0; i<9; i++) {
			
		if ((arr[i] != arr[i+1])) {
			another++;
			}
		}
		
		
		// 배열 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(another);
		
		
		
		
		
		
	}
}
