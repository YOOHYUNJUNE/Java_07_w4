package com.coding_test_4w;

//import java.util.Arrays;
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
		// 42를 나눈 몫을 담을 배열
		int[] remainArr = new int[42];
		
		// 입력받을 10개 수
		for (int i=0; i<10; i++) {
//			System.out.println("수 10개를 입력");
			int n = sc.nextInt();
			// n을 42로 나눈 몫
			int remain = n % 42;
			arr[i] = remain;
			// 몫 배열의 index를 1로 설정
			remainArr[remain] = 1;
		}
		
		// 몫 배열을 조회하여 1과 같으면 another++
		for (int i=0; i<42; i++) {
			// 몫이 1 (서로 다름)이면 ++
			if(remainArr[i] == 1) {
				another++;
			}

		}
		
		System.out.println(another);
		
		
		
		
		
		
	}
}
