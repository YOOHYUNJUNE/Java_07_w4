package com.collection.set;
import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		
		// hashSet 컬렉션 객체 생성
		Set<String> set = new HashSet<>();
		
		// 컬렉션 객체에 데이터 저장
		set.add("Java 1");
		set.add("JDBC 2");
		set.add("Servlet 3");
		set.add("JSP 4");
		set.add("MyBatis 5");
		set.add("JPA 6");
		set.add("Java 7"); // 중복이라 false
		
		System.out.println("저장된 요소 수 : " + set.size());
		System.out.println(set); // 순서 없음
		
		
		
	}
}
