package com.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		// TreeSet 컬렉션 생성 [int] scores
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 객체에 데이터 저장 (87, 98, 75, 95, 80)
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores); // 자동 정렬
		
		// 특정 요소 가져오기
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 다음 아래 점수 : " + scores.lower(95));
		System.out.println("95점 다음 위 점수 : " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("96점이거나 바로 위 점수 : " + scores.ceiling(96));

		// 내림차순 변경
		NavigableSet<Integer> descSet = scores.descendingSet();
		System.out.println(descSet);
		
		// 범위 검색 (80 이상)
		NavigableSet<Integer> up80Set = scores.tailSet(80, true); // true:포함 / false:미포함
		System.out.println(up80Set);
		
		// 범위 (80이상 90미만)
		NavigableSet<Integer> up80down95 = scores.subSet(80, true, 95, false);
		System.out.println(up80down95);
		
		
		
		
	}
}
