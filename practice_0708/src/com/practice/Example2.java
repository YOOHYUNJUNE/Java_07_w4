package com.practice;

public class Example2 {
	public static void main(String[] args) {
		// 100의 자리만 남기고 나머지는 0으로
		int num = 456;
		int result = (num/100) * 100; // num - num % 100
		System.out.println(result); // 400
		
		
		
	}
}
