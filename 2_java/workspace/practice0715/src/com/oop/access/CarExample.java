package com.oop.access;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("Jack");
		myCar.info();
		
		myCar.setSpeed(50);
		
		myCar.info();
		
		System.out.println(5 * myCar.getSpeed());
	}
}
