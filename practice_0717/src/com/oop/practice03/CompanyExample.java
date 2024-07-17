package com.oop.practice03;

public class CompanyExample {
	public static void main(String[] args) {
		
		// 직원 이름, 연봉
		Company com = new Company("자바");
		
		com.addEmployee("A", 4000);
		com.addEmployee("B", 4000);
		com.addEmployee("C", 5000);
		com.addEmployee("D", 7000);
		com.addEmployee("E", 8000);
		
		com.addEmployee("F", 4000);
		com.addEmployee("G", 7000);
		com.addEmployee("H", 6000);
		com.addEmployee("I", 4000);
		com.addEmployee("J", 4000);
		
		com.printEmployee();
		System.out.println(com.salAvg());
		
		
		
	}
}
