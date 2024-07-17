package com.oop.interface01;

public interface Service {
	
	// public static final 생략 가능
	String NAME = "인터페이스";
	
	// public abstract 생략 가능
	public abstract void abstractMethod();
	
	default void defaultMethod1() {
		defaultCommon(); // 디폴트 사용 가능
		staticMethod1(); // 정적 사용 가능
		commonMethod(); // 프라이빗이지만 클래스 안에서 사용 가능
		abstractMethod();
		System.out.println("디폴트 메소드 1" + NAME);
	}
	
	default void defaultMethod2() {
		System.out.println("디폴트 메소드 2" + NAME);
	}
	
	private void defaultCommon() {
		System.out.println("프라이빗 메소드 (디폴트에서만 사용)" + NAME);
	}
	
	// public 생략
	static void staticMethod1() {
		System.out.println("퍼블릭 정적 메소드 1" + NAME);
	}
	
	// public 생략
	static void staticMethod2() {
		staticMethod1();
		System.out.println("퍼블릭 정적 메소드 2" + NAME);
	}
	
	private static void commonMethod() {
		staticMethod1();
		System.out.println("프라이빗 정적 메소드 (내부 메소드에서 모두 사용 가능)");
	}
	
	
	
	
	
	
}
