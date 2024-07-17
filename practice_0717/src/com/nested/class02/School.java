package com.nested.class02;

public class School {
	
	// 필드(데이터)
	private String name;
	private Student[] students; // 밑에 생성했기 때문에 사용 가능
	private int studentCount;
	
	// 생성자(학교 객체 생성 시 사용)
	public School(String name) {
		this.name = name;
		this.students = new Student[13]; // 최대 학생수
		this.studentCount = 0;
	}
	
	// 입학 메소드
	public void addStudent(String studentName, int grade) {
		if (studentCount < students.length) {
			students[studentCount] = new Student(studentName, grade);
			studentCount++;
		} else {
			System.out.println("정원 초과");
		}
	}
	

	// 전체 학생 정보 출력 메소드(학교 관련 동작)
	public void printStudents() {
		for (int i=0; i<studentCount; i++) {
			System.out.println(students[i]);
		}
	}
	
	// 학생 평균 점수 메소드
	public double calcAvgGrade() {
		if (studentCount == 0) {
			return 0;
		}
		int sum = 0;
		for (int i=0; i<studentCount; i++) {
			sum += students[i].getGrade();
		}
		return (double) sum / studentCount;
	}
	
	////////////////////////////////////////////////
	private class Student {
		// 학생 관련 데이터(필드)
		private String name;
		private int grade;
		
		// 생성자
		public Student(String name, int grade) {

			this.name = name;
			this.grade = grade;
		}
		
		public String getName() {
			return name;
		}

		public int getGrade() {
			return grade;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", grade=" + grade + "]";
		}
		
		
		
	}
	
	
}
