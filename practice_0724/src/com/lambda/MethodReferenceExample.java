package com.lambda;

public class MethodReferenceExample {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		// 1. 익명 구현 객체
		p.ordering(new Comparable() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		
		// 2. 람다식 (인터페이스 이름, 추상 메소드 이름을 알고 있음 -> 매개변수와 동작만 적어줌)
		p.ordering((a, b) -> a.compareToIgnoreCase(b)); // 대소문자까지 구분

		// 3. 람다식 메소드 참조 (매개변수 활용 -> 첫째 매개변수클래스 :: 메소드)
		//					두번째 매개변수의 유무는 상관없음
		p.ordering(String::compareToIgnoreCase);

		
		
		
	}
}
