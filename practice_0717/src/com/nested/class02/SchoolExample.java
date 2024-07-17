package com.nested.class02;

public class SchoolExample {
	public static void main(String[] args) {
		
		School school = new School("인규대학교");
		
		school.addStudent("A", 100);
		school.addStudent("B", 95);
		school.addStudent("C", 90);
		school.addStudent("D", 85);
		school.addStudent("E", 80);
		
		school.addStudent("G", 75);
		school.addStudent("H", 70);
		school.addStudent("I", 65);
		school.addStudent("J", 60);
		school.addStudent("K", 55);
		
		school.addStudent("L", 50);
		school.addStudent("M", 45);
		school.addStudent("N", 40);

		school.addStudent("O", 9999);
		
		
		
		school.printStudents();
		System.out.println(school.calcAvgGrade());

		
		
	}
}
