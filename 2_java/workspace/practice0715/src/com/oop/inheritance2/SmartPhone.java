package com.oop.inheritance2;

public class SmartPhone extends Phone {
	public boolean wifi;

	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("스마트폰 생성자");
	}

	public void setWifi(boolean wifi) {
		if (wifi) {
			System.out.println("와이파이를 켭니다.");
		} else {
			System.out.println("와이파이를 끕니다.");
		}
		this.wifi = wifi;
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
