package com.stream5;

import java.util.stream.IntStream;

public class StreamExample {
	
//	public static int sum = 0;
	
	public static void main(String[] args) {
		
		// 특정 범위의 정수 스트림
//		IntStream.range(1, 10).forEach(i -> sum += i);
//		System.out.println(sum);
		
		int sum1 = IntStream.range(1, 10).sum(); // 1포함, 10미포함
		System.out.println(sum1);

		int sum2 = IntStream.rangeClosed(1, 10).sum(); // 1포함, 10포함
		System.out.println(sum2);
		
	}
}
