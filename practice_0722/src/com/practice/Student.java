package com.practice;

import java.util.*;
import java.util.Map.Entry;

public class Student {

	// 이름, 아이디, grades: 맵 필드
	private String name;
	private String id;
	private Map<String, Double> grades; // 맵(키:문자열, 값:실수) 타입 변수 선언
	
	// 점수는 new 해쉬맵
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		this.grades = new HashMap<>(); // grades 초기화
	}

	
	// addGrade 메소드
	public void addGrade(String subject, double grade) {
		grades.put(subject, grade);
	}
	
	
//	// updateGrade 메소드
//	public void updateGrade(Map<String, Double> newGrade) {
//		for (Entry<String, Double> entry : newGrade.entrySet()) {
//			String subject = entry.getKey();
//			Double grade = entry.getValue();
//			grades.put(subject, grade);
//		}
//	}
	// 매개 변수로 들어온 과목(키)과 점수(값) 변경(과목을 찾아서 변경)
	
	// updateGrade 선생님 코드
	public void updateGrade(String subject, double grade) {
		for (String sub : grades.keySet()) {
			if (sub.equals(subject)) {
				
				grades.put(subject, grade); // 키가 같다면 value는 알아서 변경
			}
		}
	}
	
	
	
	
	public Map<String, Double> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, Double> grades) {
		this.grades = grades;
	}


	
	
	
	
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Map<String, Double> getMap() {
		return grades;
	}


	public void setMap(Map<String, Double> map) {
		this.grades = map;
	}


	@Override
	public String toString() {
		return "Student [이름=" + name + ", ID=" + id + ", 등급=" + grades + "]";
	}



	
	
	
	
	
	
	
}
