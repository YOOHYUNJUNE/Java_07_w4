package com.oop.basic;

public class OopExample1 {

	public static void main(String[] args) {
		// 클래스(Korean) 만들기
		Korean k1 = new Korean("최인규", "990102-1001234");
		
		System.out.println(k1.name); // 최인규
		System.out.println(k1.gender); // 남성
		System.out.println(k1.birthYear); // 1999
		System.out.println(k1.birthMonth); // 1
		System.out.println(k1.birthDay); // 2
		System.out.println(Korean.nation); // 정적 멤버
	}

}
