package com.oop.interface04;

public class InterfaceExample {
	public static void main(String[] args) {
		
		// 구현 클래스 : InterfaceImpl
		
		// InterfaceImpl() 가 자식 인터페이스에 대입 -> 자식과 부모 모두 호출 가능
		Child ic = new InterfaceImpl(); 
		ic.methodM();
		ic.methodF();
		ic.methodC();
		
		System.out.println();
		
		// InterfaceImpl() 부모에 대입 -> 부모 메소드만 호출 가능
		Father ifa = new InterfaceImpl();
		Mother m = (Mother) ifa;
		ifa.methodF();
		
		System.out.println();
		
		// 전부 실행 가능
		Child c = (Child) ic;
		c.methodC();
		c.methodF();
		c.methodM();
		
		
		
		
		
		
		
	}
}
