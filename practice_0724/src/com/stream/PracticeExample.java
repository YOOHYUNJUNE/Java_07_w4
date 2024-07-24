package com.stream;

import java.util.Arrays;
import java.util.List;

public class PracticeExample {
	public static void main(String[] args) {
		// 샘플 상품
		Product mic = new Product("마이크");
		Product headSet = new Product("헤드셋");
		Product earPhone = new Product("이어폰");
		Product speaker = new Product("스피커");
		Product iPad = new Product("아이패드");
		Product monblancpen = new Product("몽블랑 펜");
		Product rolexWatch = new Product("롤렉스 시계");
		Product dubaiChoco = new Product("두바이 초콜릿");
		Product car = new Product("자동차");

		
		// 샘플데이터 / 유저(이름, 오더(상품리스트))
		List<User> users = Arrays.asList( // 고정 데이터
			new User("홍길동", Arrays.asList(
					new Order(Arrays.asList(mic, headSet, earPhone, speaker)),
					new Order(Arrays.asList(iPad)),
					new Order(Arrays.asList(monblancpen))
				)),
			new User("임꺽정", Arrays.asList(
					new Order(Arrays.asList(rolexWatch, dubaiChoco)),
					new Order(Arrays.asList(mic, headSet, earPhone, speaker)),
					new Order(Arrays.asList(car))
				))
		);
				
		
		// Stream<User> 생성 ->
		// flatMap 사용해서 Stream<Order>로 변환 ->
		// flatMap 사용해서 Stream<Product>로 변환 ->
		// 각 상품명 출력
		
		users.stream()
			.flatMap(o -> o.getOrders().stream())
			.flatMap(p -> p.getProducts().stream())
			.distinct()
			// n글자 이상만 가져오기
			.filter(p -> p.getName().length() >= 2)
			.forEach(i -> System.out.println(i.getName()));
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
