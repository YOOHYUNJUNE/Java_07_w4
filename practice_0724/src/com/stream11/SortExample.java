package com.stream11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<>();
		
		sList.add(new Student("박명수", 60));
		sList.add(new Student("유재석", 100));
		sList.add(new Student("정준하", 40));
	
		sList.stream()
		// sorted: comparable없는 경우엔 sorted(Comparablator)
			.sorted()
			.forEach(i -> System.out.println(i.getName() + " " + i.getScore() + "점"));
		
		System.out.println();
		
		// 내림차순
		sList.stream()
		// sorted: comparable없는 경우엔 sorted(Comparablator)
			.sorted(Comparator.reverseOrder())
			.forEach(i -> System.out.println(i.getName() + " " + i.getScore() + "점"));
		
		
		
		
		
		
	}
}
