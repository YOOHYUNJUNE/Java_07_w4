package com.oop.access;

public class Car {

	String name;
	private int speed;
	final int MAX_SPEED = 200;
	

	Car(String name) {
		this.name = name;
	}
	
	// setter : private, final을 메소드를 통해 [변경] 가능하게 하는 메소드
	public void setSpeed(int speed) {
		this.speed = speed >= 0 && MAX_SPEED >= speed ? speed : 0;
	}
	
	// getter : private, final을 메소드를 통해 [호출] 가능하게 하는 메소드
	public int getSpeed() {
		return speed;
	}
	
	
	
	void info() {
		System.out.println(name + "의 현재속도 : " + speed + " km/h");
		
	}
	 
	
	
}
