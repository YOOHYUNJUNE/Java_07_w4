package com.oop.interface02;

public class Car implements Vehicle {
	
	private int speed;

	@Override
	public void start() {
		System.out.println("출발합니다.");
		speed = 10;
		displaySpeed(speed);

	}

	@Override
	public void stop() {
		System.out.println("정지합니다");
		speed = 0;
		displaySpeed(speed);

	}
	
	public void accelerate(int increment) {
		speed += increment;
		displaySpeed(speed);
	}
	
	

}
