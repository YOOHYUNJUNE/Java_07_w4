package com.annotation;

public class Service {

	@PrintAnnotation
	public void method1() {
		System.out.println("메소드 1 실행");
	}
	
	@PrintAnnotation("+") // value= 생략가능
	public void method2() {
		System.out.println("메소드 2 실행");
	}
	
	@PrintAnnotation(value="$", number=20)
	public void method3() {
		System.out.println("메소드 3 실행");
	}
	
	
	
	
	
}
