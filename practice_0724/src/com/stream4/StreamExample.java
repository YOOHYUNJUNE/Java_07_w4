package com.stream4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		List<Product> pList = new ArrayList<>();
		
		for (int i=1; i<=5; i++) {
			Product p = new Product(i, (int) (10000 * Math.random()), "상품" + i, "회사명");
			pList.add(p);
		}
		
		Stream<Product> stream = pList.stream();
		stream.forEach(p -> System.out.println(p));
		
		// 평균 가격
		double avgPrice = pList
				.stream()
				.mapToInt(Product::getPrice)
				.average()
				.getAsDouble();
		System.out.println(avgPrice);
		
		
		
		
		
	}
}
