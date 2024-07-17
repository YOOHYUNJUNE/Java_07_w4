package com.oop.inheritance03;

public class Dog extends Animal{

	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}
	
	public void bite() {
		System.out.println("앙");
	}
	
	
}
