package com.practice06;

public class ParseExample {

	// valueOf : 기본 타입을 문자열로 변경
	public static void main(String[] args) {
		String str2 = String.valueOf(3.14);
//		String str2 = Double.toString(3.14);

		System.out.println(str2 + 0.1);
		
	// toString: 문자열로 변경
	// 자바 객체 중 최고 조상인 Object가 가지고 있는 메서드
		int a = 10;
		Integer.toString(a);
	
	}

}
