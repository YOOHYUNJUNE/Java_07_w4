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
		
		// 배열 복사
		// System.arraycopy(원본배열, 복사시작위치, 새배열, 붙여넣기시작위치, 복사개수);
		int[] oldArr2 = {1,2,3};
		int[] newArr2 = new int[5];
		
		System.arraycopy(oldArr2, 0, newArr2, 0, oldArr2.length);
		System.out.println(Arrays.toString(newArr2));
		
	}
}
