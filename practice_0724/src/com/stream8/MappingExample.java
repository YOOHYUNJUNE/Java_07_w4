package com.stream8;

import java.util.Arrays;
import java.util.List;

public class MappingExample {
	public static void main(String[] args) {
		
		List<Student> sList = Arrays.asList(
			new Student("성제현", 90),
			new Student("김태환", 80),
			new Student("하민성", 85),
			new Student("유현준", 95)
		);
		
		sList.stream()
//			.map(s -> s.getName())
//			.forEach(name -> System.out.println(name));
			.map(Student::getName)
			.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}
}
