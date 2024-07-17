package com.nested.class01;

public class AExample {
	public static void main(String[] args) {
		
		// 외부에서 중첩 클래스 생성을 위해, 클래스(객체) 먼저 생성 후 중첩 클래스 생성
		A a = new A();
//		A.B b = a.new A.B(); // B가 static인 경우 가능
		A.B b = a.new B();
		
		
		
	}
}
