package com.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		
		// 불변 객체
		List<Student> sList = Arrays.asList(
			new Student("홍길동", 90),
			new Student("임꺽정", 80),
			new Student("쭈꾸미", 85),
			new Student("가나다", 95)
		);
		
//		Stream<Student> originalStream = sList.stream();
//		IntStream intStream = originalStream.mapToInt(Student -> Student.getScore());
//		OptionalDouble optAverage = intStream.average();
//		double avg = optAverage.getAsDouble();
		
		double avg = sList
				.stream()
				.mapToInt(Student :: getScore)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
	}
}
