package com.oop.access;

public class Car {
	String name;
	private int speed;
	final int MAX_SPEED = 200;
	
	Car(String name) {
		this.name = name;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed >= 0 && MAX_SPEED >= speed ? speed : 0;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	void info() {
		System.out.println(name + "의 현재속도: " + speed + "km/h");
	}
}
