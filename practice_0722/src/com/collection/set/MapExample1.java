package com.collection.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		
		// 이름과 나이를 가지고, HashMap 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		map.put("가", 33);
		map.put("나", 28);
		map.put("다", 42);
		map.put("라", 30);
		map.put("마", 32);
		map.put("가", 10000); // 덮어씌워짐(수정)

		// 객체 요소 총 개수
		System.out.println("총 entry 수 : " + map.size());
		System.out.println(map);
		
		// 키를 통해 값 얻기
		Integer sonAge = map.get("마");
		System.out.println("마의 나이 : " + sonAge);
		
		// 키로 구성된 set을 구해서, 반복문을 통해 값만 구하기
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		// 키와 값으로 구성된 set을 반복문으로
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + " : " + value);

		}
		
		System.out.println();
				
		// 간단방법
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
		
		
		
		
		
	}
}
