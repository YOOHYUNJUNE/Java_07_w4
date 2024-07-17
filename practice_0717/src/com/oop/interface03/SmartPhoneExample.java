package com.oop.interface03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		
		Object o = new SmartPhone();
		
		
		PhoneService ps = new SmartPhone();
		
		ps.turnOn();
		ps.turnOff();
		ps.call("010-1111-2222");
//		ps.openApp("");
		SmartService ps_ss = (SmartService) ps;
		ps_ss.openApp("인스타그램");
		
		SmartService ss = new SmartPhone();
		ss.openApp("카카오톡");
		
		System.out.println();
		
		// 모두 implements한 Smartphone으로 실행
		SmartPhone sp = new SmartPhone();
		sp.turnOn();
		sp.turnOff();
		sp.call("222");
		sp.openApp("아무거나");
		
		
		
	}
}
