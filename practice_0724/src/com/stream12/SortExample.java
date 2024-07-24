package com.stream12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

	// comparable 가져오지 않고 정렬 구현 

public class SortExample {
	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<>();
		
		sList.add(new Student("박명수", 60));
		sList.add(new Student("유재석", 100));
		sList.add(new Student("정준하", 40));
	
		sList.stream()
		// sorted: comparable없는 경우엔 sorted(Comparablator)
			.sorted((s1, s2) -> s1.getScore() - s2.getScore())
			.forEach(i -> System.out.println(i.getName() + " " + i.getScore() + "점"));
		
		System.out.println();
		
		// 내림차순
		sList.stream()
			.sorted((s1, s2) -> s2.getScore() - s1.getScore())
			.forEach(i -> System.out.println(i.getName() + " " + i.getScore() + "점"));
		
		
		
		
		
		
	}
}
