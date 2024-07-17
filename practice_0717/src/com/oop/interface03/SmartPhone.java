package com.oop.interface03;

public class SmartPhone implements PhoneService, SmartService {

	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}

	@Override
	public void call(String number) {
		System.out.println(number + "에 전화 거는 중...");
	}

	@Override
	public void openApp(String appName) {
		System.out.println(appName + "을/를 실행합니다.");
	}


	
	
}
