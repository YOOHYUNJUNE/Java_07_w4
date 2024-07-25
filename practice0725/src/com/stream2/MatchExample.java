package com.stream2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatchExample {
	public static void main(String[] args) {
		
		int[] intArr1 = { 2, 4, 6, 8, 10 };
		int[] intArr2 = { 2, 3, 4, 6, 8 };
		
		// 모두 2의 배수이면 true
//		IntStream.of(intArr1);
		boolean allEvenResult1 = Arrays.stream(intArr1).allMatch(i -> i % 2 == 0);
		boolean allEvenResult2 = Arrays.stream(intArr2).allMatch(i -> i % 2 == 0);
		
		System.out.println(allEvenResult1);
		System.out.println(allEvenResult2);

		System.out.println();
		
		// 하나라도 2의 배수면 true
		boolean anyOddResult1 = Arrays.stream(intArr1).anyMatch(i -> i % 2 == 1);
		boolean anyOddResult2 = Arrays.stream(intArr2).anyMatch(i -> i % 2 == 1);

		System.out.println(anyOddResult1);
		System.out.println(anyOddResult2);
		
		System.out.println();
		
		// 10의 배수가 없으면 true
		boolean tenResult1 = Arrays.stream(intArr1).noneMatch(i -> i % 10 == 0);
		boolean tenResult2 = Arrays.stream(intArr2).noneMatch(i -> i % 10 == 0);

		System.out.println(tenResult1);
		System.out.println(tenResult2);
		
		
		
		
		
		
		
	}
}
