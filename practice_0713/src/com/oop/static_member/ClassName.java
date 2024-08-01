package com.oop.static_member;

public class ClassName {

	String instanceField = "인스턴스";
	void instanceMethod() {
		// 인스턴스 메소드는 객체가 생성된 후 호출
		// 따라서 인스턴스 필드 사용 가능
		System.out.println(instanceField);
		// 이후 정의할 정적 필드도 사용 가능
		System.out.println(staticField);
		
		instanceField = "instance";
		// 정적 필드 값을 변경하는 것이 일반적이지는 않음
		// 모든 값이 바뀜
//		staticField = "static"; 
		System.out.println(instanceField);
//		System.out.println(staticField);
		
	}
	
	
	static String staticField = "정적";
	static void staticMethod1() {
		// 중요 : 오직 정적 멤버만 사용 가능
		// 정적 메소드에서는 인스턴스 멤버 사용 불가능(instanceField )
		// 굳이 사용시, 정적 필드 안에서 인스턴스 생성
		ClassName cn = new ClassName();
		cn.instanceField = "생성 후 인스턴스 필드 사용";
		System.out.println(cn.instanceField);
		cn.instanceMethod();
	
		// this. 사용 불가능(this.instanceField )
		System.out.println(staticField);
		staticMethod2();
		
	}
	
	static void staticMethod2() {
		staticField = "static";
		
	}
	
	
}
