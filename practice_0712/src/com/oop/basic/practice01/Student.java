package com.oop.basic.practice01;

public class Student {

	String name;
	int korean, english, math, science;
	
	Student() {}
	
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	
	// 평균
	double getAvg() {
		int sum = korean + english + math + science;
		return sum/4;
	}
	
	
	// 학점
	String getGrade() {
		double avg = getAvg();
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else {
			return "C";
		}
	}
	

	
	
	
}
