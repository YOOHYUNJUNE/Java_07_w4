package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		
		// HashSet [Member]
		Set<Member> set = new HashSet<>();
		
		// 홍길동 20세 객체 저장 2번
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		
		// 저장된 객체 수 출력
		System.out.println(set.size()); // 롬복으로 할 경우 1
		// 롬복은 equal()이 true가 나오면 하나로 취급해주기 때문
		
	}
}
