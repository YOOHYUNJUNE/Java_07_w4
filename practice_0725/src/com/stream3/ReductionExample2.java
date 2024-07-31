package com.stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class ReductionExample2 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		OptionalDouble optAvg = list.stream()
//			.mapToInt(i -> i.intValue()); // Integer -> int 변경
			.mapToInt(Integer::intValue)
			.average();
		
//		double avg = optAvg.getAsDouble(); // 값이 없음
		
		// .isPresent()
		if (optAvg.isPresent()) {
			System.out.println("평균 : " + optAvg.getAsDouble());
		} else {
			System.out.println("평균 : " + 0.0);
		}
		
		
		// .orElse()
		System.out.println("평균 : " + optAvg.orElse(0.0));
		
		
		// .ifPresent()
		optAvg.ifPresent(System.out::println);
		
		
		
		
		
	}
}
