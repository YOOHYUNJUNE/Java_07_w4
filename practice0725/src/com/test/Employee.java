package com.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;
	private String email;
	
}
