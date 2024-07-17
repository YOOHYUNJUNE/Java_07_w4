package com.oop.interface05;

public class SmartPhone extends Phone implements SmartService{

	
	
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}

	@Override
	public void openApp(String appName) {
		System.out.println(appName + "을/를 실행합니다.");
	}

}
