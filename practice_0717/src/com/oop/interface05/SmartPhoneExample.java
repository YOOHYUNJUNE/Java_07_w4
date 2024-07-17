package com.oop.interface05;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		// Phone은 PhoneService를 직접 구현하고 있으므로 자동 형 변환
		PhoneService ps1 = new Phone();
		
		// 상속받아 간접적 구현, 자동 형 변환 가능
		PhoneService ps2 = new SmartPhone(); 
		
		// PhoneService에는 Smart 기능X, SmartService 호출하려면 강제 타입 변환
//		SmartService ss1 = (PhoneService) ps1; // 불가능
//		SmartService ss2 = (PhoneService) ps2; // 불가능
//		SmartPhone sp1 = (SmartPhone) ps1;
		SmartPhone sp2 = (SmartPhone) ps2;

//		SmartService ss1 = (SmartService) sp1;
		SmartService ss2 = (SmartService) sp2;
		
	}
}
