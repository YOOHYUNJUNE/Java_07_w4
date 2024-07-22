package com.practice;

import java.util.*;

public class StudentManagementSystem {

	// 필드
	private List<Student> students = new ArrayList<>();
	private Set<String> studentIds = new HashSet<>();
	
	// 기본 생성자
	public StudentManagementSystem() {};
	
	
	// addStudent 메소드 (String name, String id)
	public void addStudent(String name, String id) {
		if (studentIds.equals(id)) {
			System.out.println("이미 존재하는 학생입니다.");
		} else {
			Student newStudent = new Student(name, id);
			students.add(newStudent);
			studentIds.add(id);
		}
	}
	// studentIds에 없는 id라면 Student 생성해서 students, studentIds에 추가
	
	
	// removeStudent 메소드(String id)
	// 제거 students.remove(s)
	public void removeStudent(String id) {
		for(Student s : students) {
			if (id.equals(s.getId())) {
				students.remove(s);
		
			}
		}
	}
	// 같은 id의 학생 있으면 제거 / studentIds에서도 제거
	
	
	// updateStudent 메소드 (String id, String newName, Map<String, Double> new grade)
	public void updateStudent(String id, String newName, Map<String, Double> newGrade) {
		for (Student s : students) {
			if (s.getId().equals(id)) {
				System.out.println("학생 정보를 갱신합니다.");
				s.setName(newName);
				s.updateGrade(newGrade);
			
			} else {
				System.out.println("일치하는 정보가 없습니다.");
			}
		}
				// s.updateGrade(newName, null);
		}
		
	
	
	// students 반복해서 id같은 학생있으면 해당 학생 이름 변경(setName), 점수변경 (updateGrade 메소드 실행) 
	
	
	// listStudents 메소드
	public void listStudents() {
		for (Student s : students) {
			System.out.println(s);
		}
	}
	// students 반복해서 모든 student 출력
	
	
	
	// listStudentGrades 메소드 (String id)
	public void listStudentGrades(String id) {
		for (Student g : students) {
			System.out.println("이름 : " + g.getName() + "ID : " + g.getId() + "\t");
			// 과목
			Map<String, Double> grades = g.getGrades();
			for (Map.Entry<String, Double> entry : grades.entrySet()) {
				System.out.println("과목 : " + entry.getKey() + "점수 : " + entry.getValue());
			}
		}
	}
	// students 반복해서 id 같은 학생있으면, 해당 학생 점수 출력
	
	
	
	
}
