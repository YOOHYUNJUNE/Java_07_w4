package com.practice;

public class Example4 {
	public static void main(String[] args) {
		// 화씨(F)를 섭씨(C)로 : C = 5/9 * (F - 32)
		int fahrenheit = 100;
		float celcius = (float) 5/9 * (fahrenheit - 32);
		System.out.println("화씨 : " + fahrenheit); // 100
		System.out.println("섭씨 : " + celcius);
		
	}	
}
