package com.practice;

public class Example2 {

	public static void main(String[] args) {	
		int num = 456;
		// int result = (num / 100) * 100;
		int result = num - num % 100;
		System.out.println(result); // 400
	}
}
