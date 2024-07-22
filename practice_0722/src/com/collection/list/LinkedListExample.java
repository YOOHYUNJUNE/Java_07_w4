package com.collection.list;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		
		// ArrayList 객체 생성 [문자열]
		List<String> list1 = new ArrayList<>();
		
		// LinkedList 객체 생성 [문자열]
		List<String> list2 = new LinkedList<>();
		
		
		// 시간 측정
		long startTime;
		long endTime;
		
		
		// 종료시간
		
		// ArrayList
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("추가 시 걸린 시간(ArrayList) : " + (endTime - startTime));
		
		
		// LinkedList
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("추가 시 걸린 시간(LinkedList) : " + (endTime - startTime));
		
		
		System.out.println();
		// 조회 걸린 시간
		
		// ArrayList
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("조회 걸린 시간(ArrayList) : " + (endTime - startTime));
		
		// LinkedList
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("조회 걸린 시간(LinkedList) : " + (endTime - startTime));
		
		
		
		
		
		
	}
}
