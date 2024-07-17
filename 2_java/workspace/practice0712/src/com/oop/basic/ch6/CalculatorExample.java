package com.oop.basic.ch6;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		calc.powerOn();
		
		int plusResult = calc.plus(5, 6);
		System.out.println("결과: " + plusResult);
		
		int x = 10;
		int y = 4;
		double divideResult = calc.divide(x, y);
		System.out.println("결과: " + divideResult);
		
//		int sumResult = calc.sum(1,2,3,4,5,6,7,8,9);
		int sumResult = calc.sum(new int[] {1,2,3,4,5,6});
		System.out.println("결과: " + sumResult);
		
		double sumResult2 = calc.sum(new double[] {1.05, 2.5, 3.14});
		System.out.println("결과: " + sumResult2);
		calc.powerOff();
	}
}
