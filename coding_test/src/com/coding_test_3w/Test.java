package com.coding_test_3w;

public class Test {
	
	public static void main(String[] args) {
		
		int testInt = 10;
		String testString = "20";
		double testDouble = 30;
		
		
		System.out.println(String.valueOf(testInt) + " 타입 : " + (((Object)String.valueOf(testInt)).getClass().getName()));
		System.out.println(Integer.parseInt(testString) + " 타입 : " + ((Object)Integer.parseInt(testString)).getClass().getName());
		System.out.println(testDouble);
		
		System.out.println();
		
		int intValue = 1;
		long longValue = intValue;
		System.out.println(longValue);
		
		double a = 1.0;
		int b = 2;
		a = b;
		System.out.println(a);
		b = (int) a;
		System.out.println(b);
		
		
		
	}
	
	
}
