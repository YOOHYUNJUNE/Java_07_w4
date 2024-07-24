package com.stream7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFilterExample2 {
	public static void main(String[] args) {
		
		// 1부터 10까지 숫자 생성
		IntStream number = IntStream.rangeClosed(1, 1000);

		// 배열로 반환
//		List<IntStream> numList = Arrays.asList(IntStream.rangeClosed(1, 1000));
//		numList.stream().forEach(n -> System.out.println(n));
		
		// 스트림으로 소수만 포함하는 새로운 배열로 반환
		// 필터링된 새로운 배열 출력
		
//		// 짝수만
//		IntStream
//			.rangeClosed(1, 1000)
//			.filter(n -> n%2 == 0)
//			.forEach(i -> System.out.println(i));
//		
		
		// 소수
		IntStream
			.rangeClosed(1, 1000)
			.filter(n -> isPrime(n))
			.forEach(i -> System.out.println(i));
		
		
	}
	
	// 소수 구하기
	// 제곱근까지 나눠보는 방법
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i=2; i<=Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
