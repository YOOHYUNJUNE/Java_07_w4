package com.reference.list;

public class ListBasic6 {

	public static void main(String[] args) {
		// 다차원 배열 (배열 안에 또 다른 배열이 대입되는 것!)
		int[] arr1 = { 0, 0, 0 };
		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = { 4, 5, 6 };

		// 이건 2차원 배열! 차원의 수만큼 []이 붙는다.
		int[][] arr4 = { arr1, arr2, arr3 };
		System.out.println(arr4[2][2]);

		int[][] arr5 = { { 0, 0, 0 }, { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(arr5[2][2]);

//						{{0,0}, {0,0}, {0,0}, {0,0}}
		int[][] arr6 = new int[4][2];

//						{{0,0,0}, {0,0}, {0,0,0}}
		int[][] arr7 = new int[3][];
		arr7[0] = new int[3];
		arr7[1] = new int[2];
		arr7[2] = new int[3];
	}
}
