package com.lambda2;

public class Person {

	public Member getMember1(Creatable1 c) {
		// id를 가지고 멤버 생성 및 반환
		String id = "rain";
		Member m = c.create(id);
		return m;
	}
	
	
	public Member getMember2(Creatable2 c) {
		// id, name을 가지고 멤버 생성 및 반환
		String id = "rain";
		String name = "소나기";
		Member m = c.create(id, name);
		return m;
	}

	
	
}
