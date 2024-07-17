package com.oop.interface02;

public class CarExample {
	public static void main(String[] args) {
		
		Vehicle car = new Car();
		car.doorOpen();
		System.out.println();
		car.start();
		System.out.println();
		
		Car c = (Car) car;
		c.accelerate(60);
		System.out.println();
		c.accelerate(140);
		System.out.println();
		c.stop();
		
		Vehicle.service();
		
		
		
		
		
	}
}
