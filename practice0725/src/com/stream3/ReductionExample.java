package com.stream3;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ReductionExample {
	public static void main(String[] args) {
		
		int[] intArr = { }; // NoSuchElementException
		// 평균
		OptionalDouble optAvg = Arrays.stream(intArr).average();
//		System.out.println(optAvg.getAsDouble());
		

		// 집계값이 없는 경우(NoSuchElementException) 대처
		
		// isPresent
		if (optAvg.isPresent()) { // 값이 있다면(boolean).
			System.out.println("평균 : " + optAvg.getAsDouble());
		} else {
			System.out.println("평균 : " + 0.0);
		}
		
		
		// orElse
		double avg = Arrays.stream(intArr).average()
				.orElse(10.0); // 값이 없다면 orElse(값) 반환
		System.out.println("평균 : " + avg);
		
		
		// ifPresent
		Arrays.stream(intArr).average()
			// 값이 있을때만 출력 ( isPresent에서 else가 없는 것 )
			.ifPresent(a -> System.out.println(a));
		
		
		
		
		
		
	}
}
