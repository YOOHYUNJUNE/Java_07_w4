package com.oop.basic;

public class OopExample1 {
	public static void main(String[] args) {
		
		// 클래스 만들기
		Korean k1 = new Korean("유현준", "930109-1012345");
		System.out.println(k1.name);
		System.out.println(k1.gender);
		System.out.println(k1.birthYear);
		System.out.println(k1.birthMonth);
		System.out.println(k1.birthDay);
		
		System.out.println(k1);
		System.out.println(Korean.nation); // 정적 멤버
		
		
	
	}
}
