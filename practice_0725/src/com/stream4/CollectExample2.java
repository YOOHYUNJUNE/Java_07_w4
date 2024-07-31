package com.stream4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample2 {
	public static void main(String[] args) {
		
		List<Beverage> bList = new ArrayList<>();
		
		bList.add(new Beverage("따뜻한 아메리카노", 1500, false));
		bList.add(new Beverage("따뜻한 바닐라 라떼", 3500, false));
		bList.add(new Beverage("핫초코", 3500, false));
		bList.add(new Beverage("제로 콜라", 2000, true));
		bList.add(new Beverage("솔의눈", 2000, true));
		bList.add(new Beverage("실론티", 2000, true));
		
		
		Map<String, Boolean> newBList = bList.stream()
				.collect(Collectors.toMap(b -> b.getName(), b -> b.isIce()));
		
		System.out.println(newBList);
		System.out.println();
		
		
		Map<Boolean, List<Beverage>> isIceMap = bList.stream()
				.collect(Collectors.groupingBy(b -> b.isIce()));
//		System.out.println(isIceMap);
		for (Map.Entry<Boolean, List<Beverage>> e : isIceMap.entrySet()) {
			System.out.println(e.getKey() + " : ");
			for (Beverage b : e.getValue()) {
				System.out.println("\t" + b);
			}
		}
	
		System.out.println();
		
		
		List<Beverage> iceList = isIceMap.get(true);
		List<Beverage> hotList = isIceMap.get(false);
		
		System.out.println(iceList);
		System.out.println(hotList);
		
		System.out.println();
		
		// isIce로 구분한 후 평균값
		Map<Boolean, Double> isIceAvgPriceMap = bList.stream()
				.collect(Collectors.groupingBy(
						b -> b.isIce(),
						Collectors.averagingDouble(b -> b.getPrice())));
//						Collectors.counting()));
		
		System.out.println(isIceAvgPriceMap);
		System.out.println();
		
		
		
	}
}
