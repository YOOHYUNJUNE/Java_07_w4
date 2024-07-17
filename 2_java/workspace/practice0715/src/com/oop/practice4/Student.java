package com.oop.practice4;

public class Student {
//	인스턴스 멤버 변수로 name, age, id를 정의합니다.
	private String name, id;
	private int age;
//	정적 멤버 변수로 studentCount를 정의합니다.
	private static int studentCount;
//	생성자에서 학생 이름과 나이를 설정하고 ID를 생성합니다.
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.id = generateId();
		studentCount++;
	}
//	getter와 setter 메소드를 통해 멤버 변수에 접근합니다.
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
//	정적 메소드 getStudentCount를 통해 생성된 학생 수를 반환합니다.
	public static int getStudentCount() { return studentCount; }
//	private 메소드 generateId를 통해 학생 ID를 생성합니다. [generateId -> "S" + (1000 + 학생수);]
	private String generateId() {
		return "S" + (1000 + studentCount);
	}
//	final 메소드 printStudentInfo를 통해 학생 정보를 출력합니다.
	final void printStudentInfo() {
		System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	}
}
