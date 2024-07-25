package com.stream3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ReductionExample3 {
	public static void main(String[] args) {
		
		int[] intArr = { 1, 2, 3, 4 };
		
		int result1 = Arrays.stream(intArr)
			.reduce((a, b) -> a * b).getAsInt();
		
		System.out.println("요소의 곱 : " + result1);
			
		System.out.println();
		
		int result2 = Arrays.stream(intArr)
				.reduce(100, (a, b) -> a * b); // 100 : 출발시점 / a:누적값 / b:각 요소
			
			System.out.println("요소의 곱 : " + result2);
		
		
		
		
	}
}
