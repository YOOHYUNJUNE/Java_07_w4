package com.coding_test_5w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 소트인사이드 {
	public static void main(String[] args) {
		
		// 수 n 주어지면, 자리수대로 내림차순 정렬
		// 1234 -> 4321
		// 13579 -> 97531
		// 11311 -> 31111
		
		Scanner sc = new Scanner(System.in);
		
		// 수 n
		int n = sc.nextInt();
		
		// 가장 큰 수 지정
		int maxNum = 0;
		
		// 문자열로 만들어서 각각의 숫자로 쪼개서 배열에 넣음
		String str = "" + n;
		String[] strArr = new String[str.length()];
		
		// 문자 하나씩 넣음
		for (int i=0; i<str.length(); i++) {
			strArr[i] = String.valueOf(str.charAt(i));
		}

		// 다시 int로 변환
		int[] intArr = new int[str.length()];
		for (int i=0; i<str.length(); i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		System.out.println(Arrays.toString(intArr));
		
		
		
		// 배열에 넣고, arr[i] < arr[i+1], arr[i] = arr[i+1]
		
		
		
		
		
		
	}
}
