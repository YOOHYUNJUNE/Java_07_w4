package com.reference.basic;

public class ReferenceExample2 {
	public static void main(String[] args) {
		String name = "최인규";
		String noName = null;
		
		// 참조 데이터 타입이여도 null과 비교할 때는 비교 연산자로 비교가 가능하다.
		System.out.println(name == null);
		System.out.println(name != null);
		
		// 참조 데이터 타입에서 가장 많이 발생하는 Exception은 NullPointerException이다.
		// null인 상태에서 접근할 때 발생한다.
		System.out.println(noName.charAt(0));
	}
}
