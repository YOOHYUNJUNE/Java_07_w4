package com.object;

public class EmployeeExample {
	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "유현준", "대리", "개발팀", 10000, "test", 999999);
		emp.setPosition("과장");
		emp.setSalary(20000);
		emp.setDepartment(null);
		System.out.println(emp);
		
		
		
		
	}
}
