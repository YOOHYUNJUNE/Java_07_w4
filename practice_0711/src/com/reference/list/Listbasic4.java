package com.reference.list;

public class Listbasic4 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + ",");
		}
		System.out.println("\n");
		
		
		arr1[0] = 1;
		arr1[1] += 2;
		arr1[2] -= 3;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + ",");;
		}
		System.out.println();
		
		
		
	}
	
	
	
	
}
