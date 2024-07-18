package com.oop.practice03;

public class Company {

	private String name;
	private Employee[] employees;
	private int employeeCount;
	private static final int MAX_EMPLOYEE_COUNT = 10;
	
	
	public Company(String name) {
		this.name = name; // 회사 이름
		this.employees = new Employee[MAX_EMPLOYEE_COUNT]; // 직원 수
		this.employeeCount = 0;
	}
	
	// 입사 메소드
	public void addEmployee(String employeeName, int salary) {
		if (employeeCount < employees.length) {
			employees[employeeCount] = new Employee(employeeName, salary);
			employeeCount++;
		} else {
			System.out.println("정원 초과");
		}
	}
//	////
//	// 선생님 코드 (배열)
//	public Employee[] hire(String name, int salary) {
//		if (employeeCount < employees.length) {
//			Employee emp = new Employee(name, salary);
//			employees[employeeCount] = emp; // this.employees 도 됨
//			employeeCount++;
//			return employees;
//		}
//		return null;
//	}
//	////
	
	// 연봉 합계 메소드
	public double salSum() {
		int sum = 0;
		for (int i=0; i<employeeCount; i++) {
			sum += employees[i].getSalary();
		}
		return sum;
	}

	
	// 연봉 평균 메소드
	public double salAvg() {
		return (double) salSum() / employeeCount;
	}
	
	
	// 평균 이상 연봉인 직원 출력
	public void highSal() {
		for (int i=0; i<employeeCount; i++) {
			if (employees[i].getSalary() >= salSum() / employeeCount) {
				System.out.println("고액 연봉자 : " + employees[i]);
			}
		}
	}

	// 직원 정보 메소드
	public void printEmployee() {
		for (int i=0; i<employeeCount; i++) {
			System.out.println(employees[i]);
		}
	}
	

	
	///////////////////////////////////////////////
	///////////////////////////////////////////////
	// 직원 클래스
	
	private class Employee {
		
		private String name; // 직원명
		private int salary; // 입사 연봉
		
		
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
	
}
