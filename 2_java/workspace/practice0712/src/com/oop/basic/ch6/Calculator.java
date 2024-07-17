package com.oop.basic.ch6;

public class Calculator {
	boolean power;
	
	void powerOff() {
		System.out.println("전원을 끕니당~");
		this.power = false;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니당~");
		this.power = true;
	}
	
	int plus(int x, int y) {
		return power ? x + y : null;
	}
	
	double divide(int x, int y) {
		return power ? (double) x / y : null;
	}
	
	// multiple
	// substract
	
	int sum(int...values) {
		int result = 0;
		if (power) {
			for (int i : values) {
				result += i;
			}
		}
		return result;
	}
	
	double sum(double...values) {
		double result = 0;
		if (power) {
			for (double i : values) {
				result += i;
			}
		}
		System.out.println(result);
		return Math.round(result * 100) / 100.0;
	}
	
}
