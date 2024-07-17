package com.practice08;

public class OverFlowExample {
	public static void main(String[] args) {
		byte byteValue = 127;
		System.out.println(++byteValue);
		System.out.println(--byteValue);
		
		short shortValue = 32767;
		System.out.println(++shortValue);
		System.out.println(--shortValue);
		
		int intValue = 2_147_483_647;
		System.out.println(++intValue);
		System.out.println(--intValue);
		
		long longValue = 9_223_372_036_854_775_807L;
		System.out.println(++longValue);
		System.out.println(--longValue);
		
		// 높은 범위의 타입 연산을 하게 함
		byte var1 = 125;
		for (int i = 0; i < 5; i++) {
			if (Byte.MAX_VALUE == var1) {
				break;
			}
			var1++;
			System.out.println("i : " + i);
			System.out.println("var1 : " + var1);
		}
	
	}
}
