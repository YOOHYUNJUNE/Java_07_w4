package com.coding_test_4w;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
	public static void main(String[] args) {
		
		// 백준 10989 : 수 정렬하기 3
		// N개 수 입력, 오름차순 정렬
		// a > b ? a : b
		
		Scanner sc = new Scanner(System.in);
		// 수 개수 입력
		System.out.println("개수 입력");
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		// 수 N개 입력
		for (int i=0; i<N; i++) { 
				int n = sc.nextInt();
				arr[i] = n;
		}
		
		for (int i=0; i<N; i++) { 
			for (int j=0; j<N - i - 1; j++) { 
				if (arr[j] > arr[j+1]) {
					int a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = a;
				}
				
			}
		}
		
		for (int s : arr) {
			System.out.println(s);
		}
	
		
//		System.out.println(Arrays.toString(arr));
		
	}
}
