package com.oop.basic;

public class Korean {
	
	// 정적 멤버: 클래스에 고정
	static String nation = "Korean";
	
	
	String name, gender;
	int birthYear;
	int birthMonth;
	int birthDay;
	
	Korean() {}
	
	public Korean(String name, String number) {
		this.name = name;
		this.birthYear = Integer.parseInt(number.substring(0,2));
		this.birthMonth = Integer.parseInt(number.substring(2,4));
		this.birthDay = Integer.parseInt(number.substring(4,6));
	
	int genderCode = Integer.parseInt(number.substring(7,8));
	if (genderCode % 2 == 0) {
		this.gender = "여성";
	}
	if (genderCode % 2 != 0) {
		this.gender = "남성";
	}


	int year = birthYear;
	if (year <= 24) {
		this.birthYear = 2000 + year;
	} else {
		this.birthYear = 1900 + year;
	}
	
	
	
	
	
	
	
	
	}
	
}
