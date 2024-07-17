package com.oop.singleton;

public class Singleton {

	// 싱글톤 : private인 클래스를 특별한 방법으로만 사용 가능하게 함
	// Calendar와 같은 방식
	private static Singleton st = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (st == null) {
			st = new Singleton();
		}
		return st;
	}
	
	
}
