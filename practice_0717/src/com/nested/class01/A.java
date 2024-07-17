package com.nested.class01;

public class A {
	
	// 인스턴스 필드
	int number = 0;
	B b;// 중첩 클래스를 인스턴스 필드로 사용
	C c; // 중첩 클래스를 인스턴스 필드로 사용
	D d; // 중첩 클래스를 인스턴스 필드로 사용
	
	
	// 정적 필드
	static int totalNumber = 0;
	
	// 기본 생성자
	A() {
		this.b = new B(); // 로컬 클래스 : 중첩 클래스를 생성자 내부에서 사용
		this.c = new C(); // 중첩 클래스를 생성자 내부에서 사용
		this.d = new D(); // 중첩 클래스를 생성자 내부에서 사용
	}
	
	// 인스턴스 메소드
	void hello() {
		System.out.println("(instance) Hello, World!");
	}
	
	// 정적 메소드
	static void staticHello() {
		System.out.println("(static) Hello, World!");
	}
	
	// 중첩 클래스
	public class B { 
		// 어디서든지 사용 가능
		// 필드, 메서드, 생성자 (원래 정적 필드, 정적 메소드는 올 수 없음) : Java 17부터 가능
		
	}
	class C { 
		// 같은 패키지에서만 사용 가능
	}
	private class D { 
		// A 클래스 내에서만 사용 가능
	}
	
	
	
	
	
	
	
	
	
}
