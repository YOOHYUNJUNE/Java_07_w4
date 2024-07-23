package com.collection.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		// 키:문자열 / 값:정수
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		// 엔트리
		treeMap.put("오예스", 2000);
		treeMap.put("크리스피", 200);
		treeMap.put("빠다코코넛", 1400);
		treeMap.put("단백질음료", 3000);
		treeMap.put("조청유과", 10000);
		treeMap.put("가나초콜릿", 1000);
		
		System.out.println(treeMap); // 키(가나다 순) 자동 정렬
		
		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		Entry<String, Integer> firstEntry = treeMap.firstEntry(); // 첫째 키값 
		System.out.println(firstEntry.getKey() + " : " + firstEntry.getValue());
		
		System.out.println();
		
		Entry<String, Integer> lastEntry = treeMap.lastEntry(); // 마지막 키값 
		System.out.println(lastEntry.getKey() + " : " + lastEntry.getValue());
		
		System.out.println();
		
		Entry<String, Integer> lowerOhYesEntry = treeMap.lowerEntry("오예스"); // 입력값 바로 다음 작은 값
		System.out.println(lowerOhYesEntry.getKey() + " : " + lowerOhYesEntry.getValue());
		
		System.out.println();
		
		// 내림차순
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		System.out.println(descendingMap);
		
		System.out.println();
		
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		for (Entry<String, Integer> entry : descendingEntrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		System.out.print("가 ~ 자 까지 범위 검색 : ");
		NavigableMap<String, Integer> gaToJaMap = treeMap.subMap("가", true, "자", true);
		System.out.println(gaToJaMap);
		
		
	}
}
