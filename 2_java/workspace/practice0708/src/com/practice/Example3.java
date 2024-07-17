package com.practice;

public class Example3 {

	public static void main(String[] args) {	
		char ch = 'z';
		boolean b = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
		System.out.println(b); // true
	}
}
