package com.oop.interface07;

public class Driver {
	
	void drive(Vehicle v) {
		if (v instanceof Bus) {
			Bus b = (Bus) v;
			b.checkFare();
		}
		v.run();
	}
	
	
}
