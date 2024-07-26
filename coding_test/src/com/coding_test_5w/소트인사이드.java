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
		
		Arrays.sort(intArr); // 내림차순 정렬은 안됨
		System.out.println(Arrays.toString(intArr));
		
		// 오름차순 정렬한 배열을 내림차순으로
		// 임시
		int[] arrTemp = new int[intArr.length];

		for (int i=0; i<intArr.length; i++) {
			arrTemp[i] = intArr[intArr.length - 1 - i];
		}
//		System.out.println(Arrays.toString(arrTemp));

		// 배열을 다시 숫자로 만들기
		
		// int -> String
		String[] arr = new String[arrTemp.length];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = String.valueOf(arrTemp[i]);
			System.out.print(arr[i]);
		}
	
		
		
	
		
		
		
		
		
	}
}
