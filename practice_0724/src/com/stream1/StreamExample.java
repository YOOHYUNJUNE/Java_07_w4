package com.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		List<String> languageList = new ArrayList<>();
		
		languageList.add("java");
		languageList.add("javaScript");
		languageList.add("Python");
		languageList.add("C");
		
		// 병렬 스트림 얻기 : 스레드를 생성해서 분배
		Stream<String> ps = languageList.parallelStream();
		ps.forEach(name -> {
			System.out.println(name + " : " + Thread.currentThread().getName());
		});
		
		System.out.println();
		
		// for문 : 전부 main 스레드
		for (String name : languageList) {
			System.out.println(name + " : " + Thread.currentThread().getName());
		}
		
	}
}
