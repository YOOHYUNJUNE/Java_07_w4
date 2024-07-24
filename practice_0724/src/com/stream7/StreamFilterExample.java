package com.stream7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("우상혁", "황선우", "김우민", "서채현", "신유빈", "우상혁");
		
		nameList.stream().distinct().forEach(n -> System.out.print(n + ", ")); // 중복 제거
		
		System.out.println();
		
		// filter로 "우"가 들어간 이름만 반환
		nameList
			.stream()
			.filter(n -> n.contains("우"))
			.forEach(n -> System.err.print(n + ", "));

		System.out.println();
		
		// distinct로 중복 제거, filter로 "우" 들어간 이름만 반환
		
		nameList
			.stream()
			.distinct()
			.filter(n -> n.contains("우"))
			.collect(Collectors.toList())
			.forEach(n -> System.err.print(n + ", "));
		
		System.out.println();
		
		// 배열로 반환
		List<String> filteredList = nameList
			.stream()
			.distinct()
			.filter(n -> n.contains("우"))
			.collect(Collectors.toList());
		System.out.println(filteredList);
		
	}
}
