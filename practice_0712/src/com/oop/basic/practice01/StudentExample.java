package com.oop.basic.practice01;

public class StudentExample {
	public static void main(String[] args) {
		
		Student Kim = new Student("김", 90, 85, 80, 75);
		Student Lee = new Student("이", 80, 95, 60, 99);
		Student Park = new Student("박", 90, 95, 94, 89);
		
		System.out.println(Kim.name + "\t" + Kim.korean + "\t" + Kim.english + "\t" + Kim.math);
		System.out.println(Kim.getAvg() + "\t" + Kim.getGrade());
		
		
	}
}
