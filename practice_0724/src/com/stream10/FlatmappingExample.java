package com.stream10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatmappingExample {
	public static void main(String[] args) {
		
		List<String> msgList = new ArrayList<>();
		msgList.add("안녕? 난 홍길동이야.");
		msgList.add("우리 같이 열심히 공부하자!");
		msgList.add("임꺽정님 보고 싶어요,");
		
		msgList.stream() // Stream<String>
			.flatMap(msg -> Arrays.stream(msg.split(" "))) // Stream<String>
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		// 각 숫자들로 나눠서 반환
		List<String> strNums = Arrays.asList("10, 20, 30", "40, 50", "60"); // 불변객체
		strNums.stream() // Stream<String>
			.flatMapToInt(e -> {
				String[] strArr = e.split(","); // , 를 기준으로 자름 -> 문자열 배열["10", " 20"...]
				int[] intArr = new int[strArr.length];
				for (int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
//				return IntStream.of(intArr);
				return Arrays.stream(intArr); // IntStream 타입이 됨
			})
			.forEach(i -> System.out.print(i + " "));
		
		
	}
}
