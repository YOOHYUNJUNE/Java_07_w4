package com.reference.list;

import java.util.Arrays;

public class ListBasic10 {

	public static void main(String[] args) {
		int[] arr = {1, 9, 8, 4, 2, 3, 5, 7, 6};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = { "carrot", "apple", "dragon", "banana"};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
