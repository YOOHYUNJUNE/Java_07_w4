package com.stream;

import java.util.Arrays;

public class LoopExample {
	public static void main(String[] args) {
		
		int[] intArr = { 1, 2, 3, 4, 5 };
		int total = Arrays.stream(intArr)
				.filter(i -> i%2==0)
//				.peek(even -> System.out.println(even)) // peek는 중간처리까지만 함
				.peek(System.out::println)
				.sum();
//		System.out.println(total);
		System.out.println();
		
		Arrays.stream(intArr)
			.filter(i -> i%2==1)
//			.forEach(odd -> System.out.println(odd));
			.forEach(System.out::println);
			
		
	}
}
