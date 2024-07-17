package com.reference.list;

import java.util.Arrays;

public class Listbasic10 {
	public static void main(String[] args) {
		
		int[] arr = {1,9,5,49,5,23,42,55,66};
		Arrays.sort(arr);
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
		System.out.println(Arrays.toString(arr));
		
		
		String[] arr2 = {"carrot", "apple", "dragon", " banana", "banana"};
		Arrays.sort(arr2);
//		for(String str : arr2) {
//			System.out.println(str + " "); // 공백은 앞으로
//		}
		System.out.println(Arrays.toString(arr2));
		
		
	}
}
