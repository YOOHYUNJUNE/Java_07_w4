package com.lambda2;

public class ConstructorExample {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		// 멤버 1
		p.getMember1(new Creatable1() {
			
			@Override
			public Member create(String id) {
				return new Member(id);
			}
		});
		
		// 람다식 1
		p.getMember1((String id) -> {
				return new Member(id);
		});
		
		// 2
		p.getMember1(id -> new Member(id));
		
		// 3 : 메소드 참조
		p.getMember1(Member::new);

		System.out.println();
		
		// 멤버 2
		p.getMember2(new Creatable2() {
			@Override
			public Member create(String id, String name) {
				return new Member(id, name);
			}
		});
		
		// 람다식
		p.getMember2((id, name) -> new Member(id, name));
		p.getMember2(Member::new);

		
		
		
	}
}
