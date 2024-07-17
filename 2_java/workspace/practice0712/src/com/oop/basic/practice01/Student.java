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
	
	double getAvg() {
		int sum = korean + english + math + science;
		return (double) sum / 4;
	} 
	
	String getGrade() {
		double avg = getAvg();
		if (avg <= 100 && avg >= 90) {
			return "A";
		} else if (avg < 90 && avg >= 70) {
			return "B";
		} else if (avg < 70 && avg >= 50) {
			return "C";
		} else if (avg < 50 && avg >= 30) {
			return "D";
		} else {
			return "F";
		}
	}
}
