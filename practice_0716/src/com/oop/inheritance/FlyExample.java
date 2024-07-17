package com.oop.inheritance;

public class FlyExample {
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
//		sa.setFlyMode(2);
		sa.setFlyMode(SupersonicAirplane.SUPERSONIC); // 정적 멤버를 가져옴(고정값)
		sa.fly();
		sa.land();
		
		
		
	}
}
