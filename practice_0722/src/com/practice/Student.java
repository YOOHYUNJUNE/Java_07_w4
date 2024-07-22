package com.practice;

import java.util.*;

public class Student {

	// 이름, 아이디, grades: 맵 필드
	private String name;
	private String id;
	private Map<String, Double> grades = new HashMap<>();
	
	// 점수는 new 해쉬맵
//	public Student(String name, String id) {
	public Student(String name, String id, Map<String, Double> grades) {

		this.name = name;
		this.id = id;
		this.grades = grades;
	}

	
	
	// addGrade 메소드
	public void addGrade(String subject, Double grade) {
		
	}
	
	
	// updateGrade 메소드
	public void updateGrade(String subject, Double grade) {
		
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
//		return "Student [이름=" + name + ", ID=" + id + ", 등급=" +  "]";
		return "Student [이름=" + name + ", ID=" + id + ", 등급=" + grades + "]";

	}
	
	
	
	
	
	
}
