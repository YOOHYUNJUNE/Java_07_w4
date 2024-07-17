package com.practice08;

public class ExceptionExample {
	public static void main(String[] args) {
//		int exception = 5 / 0;
//		System.out.println(exception);
		double a = 5 / 0.0;
		System.out.println(a); 
		
		double notANumber = 5 % 0.0;
		System.out.println(notANumber);
		
		double infinity = a;
		
		if (!Double.isInfinite(infinity)) {
			double result1 = infinity + 1;
			System.out.println(result1);
		}
		
		if (!Double.isInfinite(notANumber)) {
			double result2 = notANumber + 1;
			System.out.println(result2);
		}
	}
}
