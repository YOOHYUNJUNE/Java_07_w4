package com.coding_test_3w;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		// 첫 줄: 행렬 크기 n, m
		// 이후 첫 행렬[n][m]
		// 둘째 행렬[n][m]
		// 두 행렬의 합이 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 행렬 크기
//		System.out.println("행렬의 크기를 정해주세요.");
		int n = sc.nextInt();
		int m = sc.nextInt();
//		System.out.println("값을 입력해주세요.");
		
		// 첫 째 행렬
		int[][] arr1 = new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		// 둘 째 행렬
		int[][] arr2 = new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		// 행렬 덧셈
		int[][] arr3 = new int[n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				//출력
				System.out.println(arr3[i][j]);
			}
		}		
		
		
		
	}
}
