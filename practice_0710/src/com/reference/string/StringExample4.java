package com.reference.string;

public class StringExample4 {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		char var = subject.charAt(3);
		int len = subject.length();
		
		// 공백도 문자로 취급
		System.out.println(var); 
		System.out.println(len);
		
		for (int i=0; i<subject.length(); i++) {
			System.out.println(subject.charAt(i));
		}
		
	}
}
