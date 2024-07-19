package com.coding_test_4w;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		// 예시 배열
		int[] arr = {1,9,5,49,5,23,42,55,66};
		
		// 배열 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 배열 앞에 자르기
//		Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(Arrays.copyOf(arr, 4)));
		
		
		
		
	}
}
