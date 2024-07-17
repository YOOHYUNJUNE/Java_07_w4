package com.review.car;

public class CarExample {
	public static void main(String[] args) {
		
		Car c1 = new Car("현대", "소나타", 2024);
		Car c2 = new Car("기아", "스포티지", 2023);
		
		ECar ec1 = new ECar("테슬라", "Y", 2022, 100);
		
//		c1.printCarInfo();
//		c2.printCarInfo();
//		ec1.printCarInfo();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(ec1.toString());
		
		
		System.out.println("총 자동차 수 : " + Car.getCarCount());
		
		
		
		
	}
}
