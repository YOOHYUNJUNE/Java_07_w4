package com.oop.basic.ch04;

public class KoreanExample {
	public static void main(String[] args) {
		Korean me = new Korean("유현준", "930109-1012345");
		System.out.println(me.nation + ", " + me.name + ", " + me.ssn);
		
		Korean u = new Korean("홍길동", "991010-1234567");
		System.out.println(u.nation + ", " + u.name + ", " + u.ssn);
		
		
	}
}
