package com.oop.basic;

public class Korean {
	static String nation = "Korean";
	String name, gender;
	int birthYear, birthMonth, birthDay;
	
	public Korean(String name, String number) {
		this.name = name;
		
		int genderCode = Integer.parseInt(number.substring(7, 8));
		if (genderCode % 2 == 0) {
			this.gender = "여자";
		} else {
			this.gender = "남자";
		}
		
		int year = Integer.parseInt(number.substring(0, 2));
		this.birthYear = 1900 + year;
		if (genderCode >= 3) {
			this.birthYear = 2000+year;
		}
		
		int month = Integer.parseInt(number.substring(2, 4));
		this.birthMonth = month;
		
		int day = Integer.parseInt(number.substring(4, 6));
		this.birthDay = day;
	}
}
