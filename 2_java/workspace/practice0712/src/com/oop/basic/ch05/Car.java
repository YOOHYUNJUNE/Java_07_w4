package com.oop.basic.ch05;

public class Car {
	String model;
	String color;
	int speed;
	boolean start;
	
	Car() { 
		this("그랜저", "검정", 0, false);
	}
	
	Car(String model) {
		this(model, "검정", 0, false);
	}
	
	Car(String model, String color) {
		this(model, color, 0, false);
	}
	
	Car(String model, String color, int speed) {
		this(model, color, speed, false);
	}
	
	Car(String model, String color, int speed, boolean start) {
		System.out.println("모델명, 색상명, 속도, 시동여부 생성자 호출");
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.start = start;
	}
}
