package com.oop.static_member;

public class ClassName {
	String instanceField = "인스턴스";
	void instanceMethod() {
		// 인스턴스 메소드는 객체가 생성된 뒤에 호출!
		// 따라서 인스턴스 필드를 사용할 수 있다.
		System.out.println(instanceField);
		// 정적 필드도 사용할 수 있다.
		System.out.println(staticField);
		instanceField = "instance";
//		staticField = "static"; // 정적 필드 값을 변경하는 것은 일반적이지는 않다.
		System.out.println(instanceField);
//		System.out.println(staticField);
	}
	
	static String staticField = "정적";
	static void staticMethod1() {
		// 중요! 정적 메소드에서는 인스턴스 멤버(필드, 메소드)를 사용할 수 없다!!!!
		// System.out.println(instanceField);
		// 중요! 정적 메소드에서는 this도 사용할 수 없다!!!!
		// System.out.println(this.instanceField);
		// 중요!!!! 오직 정적 멤버만이 사용 가능하다.
		System.out.println(staticField);
		staticMethod2();
		
		// 굳이 인스턴스를 사용해야겠다면, 인스턴스를 여기서 생성해서 사용해야 한다.
		ClassName cn = new ClassName();
		cn.instanceField = "생성 후 인스턴스 필드 사용";
		System.out.println(cn.instanceField);
		cn.instanceMethod();
	}
	static void staticMethod2() {
		staticField = "static";
	}
}
