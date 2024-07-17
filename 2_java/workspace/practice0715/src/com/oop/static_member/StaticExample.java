package com.oop.static_member;

public class StaticExample {
	String instanceField = "Hello";
	void instanceMethod() {
		System.out.println("인스턴스 메소드를 호출합니다.");
		System.out.println("인스턴스 필드 : " + instanceField);
	}
	
	public static void main(String[] args) {
		// 정적 메소드에서는 인스턴스 멤버(필드, 메소드)를 사용할 수 없다!!!!
		// System.out.println(instanceField);
		// instanceMethod();
		StaticExample se = new StaticExample();
		System.out.println(se.instanceField);
		se.instanceMethod();
	}
}
