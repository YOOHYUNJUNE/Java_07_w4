package com.lambda4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Person implements Comparable<Person> { // 정렬을 위해 "비교" implements 
//public class Person { // 정렬을 위해 "비교" implements 

	private String name;
	private int age;
	
	@Override
	public int compareTo(Person o) {
		// 나이 비교
//		return Integer.valueOf(age).compareTo(o.getAge());
		if (age < o.getAge()) return -1;
		else if (age == o.getAge()) return 0;
		return 1;
	}
	
	
}
