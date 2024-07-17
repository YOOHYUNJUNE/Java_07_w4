package com.practice;

public class Example3 {
	public static void main(String[] args) {
		// 영문자(대 or 소)일때만 b가 true 조건
		char ch = 'z'; // a~z
		boolean b = ((ch >= 'A') && (ch <= 'Z')) || ((ch >= 'a') && (ch <= 'z'));
		System.out.println(b); // true
		
	}
}
