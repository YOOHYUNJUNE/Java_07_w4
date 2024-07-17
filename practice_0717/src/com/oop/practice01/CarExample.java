package com.oop.practice01;

public class CarExample {
	public static void main(String[] args) {
		
		Car[] cars = new Car[2];
//		Car[] cars = { new L3(...), new L5(...)};
		
		cars[0] = new L3("L3", "1500", 50, 25, 0);
		cars[1] = new L5("L5", "2000", 70, 35, 0);
		
		System.out.println("이름 \t 엔진크기  \t 오일용량 \t  오일여분 \t 주행거리 \t\t 온도");
		
		for (Car car : cars) {
			System.out.println(car);
		}
		
		System.out.println();
		
		for (Car car : cars) {
			car.setOil(25);
			car.go(80);
			System.out.println(car);
		}
		

		
		
		
		
	}
}
