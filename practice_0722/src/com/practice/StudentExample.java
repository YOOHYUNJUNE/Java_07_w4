package com.practice;

import java.util.HashMap;
import java.util.Map;

public class StudentExample {
	public static void main(String[] args) {
		
		StudentManagementSystem system = new StudentManagementSystem();
		system.addStudent("김윤아", "S1001");
		system.addStudent("손흥민", "S1001");

		system.listStudents();
		
		System.out.println();
		
//		// Map.of 대신
//		Map<String, Double> yunaGrades = new HashMap<>();
//		yunaGrades.put("수학", 99.7);
		
		system.updateStudent("S1001", "김연아", Map.of("수학", 99.7, "과학", 95.3));
		system.listStudentGrades("S1001");
		
		System.out.println();
//		
		system.removeStudent("S1002");
		system.listStudents();
//		
		
		
		
		
	}
}
