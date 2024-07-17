package com.oop.basic;

public class OopExample2 {

	public static void main(String[] args) {
		Car myCar = new Car("소나타");
		System.out.println(myCar.model);
		System.out.println(myCar.gas);
		System.out.println(myCar.speed);
		System.out.println();
		myCar.gas = 100;
		myCar.speed = 100;
		System.out.println(myCar.model);
		System.out.println(myCar.gas);
		System.out.println(myCar.speed);
		System.out.println();
		myCar.setSpeed(200);
		System.out.println(myCar.model);
		System.out.println(myCar.gas);
		System.out.println(myCar.speed);
		System.out.println();
		myCar.run();
		System.out.println(myCar.model);
		System.out.println(myCar.gas);
		System.out.println(myCar.speed);
		System.out.println();
	}

}
