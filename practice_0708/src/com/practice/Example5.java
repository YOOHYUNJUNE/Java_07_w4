package com.practice;

public class Example5 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		char ch = 'A';
		
		ch = (char) (ch + (b/a));
		float f = (float) c / b;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d == f2;
		System.out.println("c=" + c); // 30
		System.out.println("ch=" + ch); // C
		System.out.println("f=" + f); // 1.5
		System.out.println("result" + result); // true
	}	
}
