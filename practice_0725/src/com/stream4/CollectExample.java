package com.stream4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		
		List<Beverage> bList = new ArrayList<>();
		
		bList.add(new Beverage("아이스 아메리카노", 1500, true));
		bList.add(new Beverage("따뜻한 바닐라 라떼", 3500, false));
		bList.add(new Beverage("제로 콜라", 2000, true));
		bList.add(new Beverage("솔의눈", 2000, true));
		bList.add(new Beverage("실론티", 2000, false));
		bList.add(new Beverage("실론티", 2000, false)); // 중복으로 하나 더 추가
		
		List<Beverage> two$List = bList.stream()
			.filter(b -> b.getPrice() == 2000) // filter는 중간처리 Stream<Beverage>
			.collect(Collectors.toList()); // List<Beverage> 타입
		
		System.out.println(two$List);
		System.out.println();
		
		Set<Beverage> threeSet = bList.stream()
			.filter(b -> b.getName().length() == 3)
			.collect(Collectors.toSet()); // Set<Beverage> 타입
		
		System.out.println(threeSet);
		System.out.println();
		
		Map<String, Integer> iceMap = bList.stream()
			.filter(b -> b.isIce())
			.distinct()
			.collect(Collectors.toMap(b -> b.getName(), b -> b.getPrice())); // toMap: 키, 값
			
		System.out.println(iceMap);
		
		
		
		
		
		
		
		
		
		
	}
}
