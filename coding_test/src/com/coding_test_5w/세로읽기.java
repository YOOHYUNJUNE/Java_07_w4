package com.coding_test_5w;

import java.util.Scanner;

public class 세로읽기 {
	public static void main(String[] args) {
		
	
	
	// 다섯 개의 단어(a ~ Z , 0 ~ 9 사용)
	// 출력 시 세로로 하나씩 읽어옴
	
	// ( 각 단어의 글자수는 1 ~ 15자 )
	// abcde
	// 12345
	// ABCDE
	// 5
	// asdfg
	
	// 출력 -> a1A5a / b2Bs / c3Cd / d4Df / e5eg
	
	Scanner sc = new Scanner(System.in);
	
	// 5개의 단어와
//	System.out.println("1번 째 단어");
	String a = sc.nextLine();
//	System.out.println("2번 째 단어");
	String b = sc.nextLine();
//	System.out.println("3번 째 단어");
	String c = sc.nextLine();
//	System.out.println("4번 째 단어");
	String d = sc.nextLine();
//	System.out.println("5번 째 단어");
	String e = sc.nextLine();
	
	// 단어의 길이
//	int aLen = a.length();

	// 각 단어의 n번째 단어
//	System.out.println(a.charAt(n));
	
	// 일단 모든 단어가 같은 자리수 일 때
//	for (int i=0; i<a.length(); i++) {
//		String word1 = "" + a.charAt(i) + b.charAt(i) + c.charAt(i) + d.charAt(i) + e.charAt(i); 
//		System.out.print(word1 + " / ");
//	}
	
	// 입력된 단어의 최고 길이
	int maxLen = Math.max( a.length(), Math.max(b.length(), Math.max(c.length(), Math.max(d.length(), e.length()))) );
	

	// maxLen보다 짧은 단어면 그만큼 공백을 더함
	// 공백을 더해서 갱신
	
	// a
	if (a.length() < maxLen) {
		StringBuilder sb = new StringBuilder(a);
		for (int i=0; i<maxLen-a.length(); i++) {
		sb.append(" ");
		}
		a = sb.toString();
	}
	
	// b
	if (b.length() < maxLen) {
		StringBuilder sb = new StringBuilder(b);
		for (int i=0; i<maxLen-b.length(); i++) {
		sb.append(" ");
		}
		b = sb.toString();
	}
	
	// c
	if (c.length() < maxLen) {
		StringBuilder sb = new StringBuilder(c);
		for (int i=0; i<maxLen-c.length(); i++) {
		sb.append(" ");
		}
		c = sb.toString();
	}
	
	// d
	if (d.length() < maxLen) {
		StringBuilder sb = new StringBuilder(d);
		for (int i=0; i<maxLen-d.length(); i++) {
		sb.append(" ");
		}
		d = sb.toString();
	}
	
	// e
	if (e.length() < maxLen) {
		StringBuilder sb = new StringBuilder(e);
		for (int i=0; i<maxLen-e.length(); i++) {
		sb.append(" ");
		}
		e = sb.toString();
	}
	
//	System.out.println(maxLen);
//	System.out.println(a + ".");
//	System.out.println(b + ".");
//	System.out.println(c + ".");
//	System.out.println(d + ".");
//	System.out.println(e + ".");
	
	
	// 공백제거 : replace(" ", "")
	for (int i=0; i<a.length(); i++) {
	String word = "" + a.charAt(i) + b.charAt(i) + c.charAt(i) + d.charAt(i) + e.charAt(i); 
	System.out.print(word.replace(" ", ""));
}
	
	
	
	
	
	
	
	
	}
}
