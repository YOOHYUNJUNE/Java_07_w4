package com.practice;

public class Example1 {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 = 'A';
		char c2 = 'B';
		char c3 = '1';
		char c4 = '2';
		int inx = 2;
		
		System.out.println();
		
		System.out.println(s1 + s2); // 12
		System.out.println(!bnx); // true
		System.out.println((int) c1 + c2); // 131
		System.out.println((int) c4 + Integer.parseInt(s1)); // 51
		System.out.println(c3 + c4); // 99
		
		
		
	}
}
