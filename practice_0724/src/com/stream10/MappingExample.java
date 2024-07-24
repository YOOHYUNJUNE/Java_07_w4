package com.stream10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingExample {
	public static void main(String[] args) {
		
		// 1부터 1000까지 숫자 생성
		List<Integer> primeList = IntStream.rangeClosed(1, 1000)
			.filter(n -> isPrime(n))
			.boxed()
			.collect(Collectors.toList());
		System.out.println(primeList);
		
		System.out.println();
		
		// double 타입으로 만들기
		// 1부터 5까지 IntStream 생성, double 타입으로 변환하고 출력
		IntStream.rangeClosed(1, 5)
			.asDoubleStream()
			.forEach(v -> System.out.println(v));
	
		System.out.println();
		
		// 배열로 만들기
		// 1부터 5까지 IntStream 생성, double 타입 배열로 변환하고 출력
		List<Double> doubleList = IntStream.rangeClosed(1, 5)
			.asDoubleStream()
			.boxed()
			.collect(Collectors.toList());
		System.out.println(doubleList);
		
		
		
	} // 메인 클래스
	
	// 소수 구하기 : 제곱근까지 나눠보는 방법
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
