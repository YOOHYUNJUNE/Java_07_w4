package com.oop.interface01;

public class ServiceExample {
	public static void main(String[] args) {
		
		System.out.println(Service.NAME);
		Service.staticMethod1();
		Service.staticMethod2();
		
		// 인터페이스는 이렇게 못 만듦
//		Service s = new Service(); 
		
		// 인터페이스 변수 = new 구현클래스();
		Service s = new ServiceImpl();
		s.defaultMethod1();
		s.defaultMethod2();
		
		// Service에서 추상메소드 호출
		s.abstractMethod();
		
		
		
		
	
		
	}
}
