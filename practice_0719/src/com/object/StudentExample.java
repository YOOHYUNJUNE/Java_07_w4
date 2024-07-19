package com.object;

public class StudentExample {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(1, new String("홍길동"));

		System.out.println(s1.getName() == s2.getName());
		System.out.println(s1.getName() == s3.getName());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println("홍길동".hashCode());
		
		
		
	}
}
