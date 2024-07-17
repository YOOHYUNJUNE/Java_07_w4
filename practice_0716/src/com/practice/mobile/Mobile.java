package com.practice.mobile;

public abstract class Mobile {

	String mobileName, osType;
	int batterySize;
	
	public Mobile() {}

	public Mobile(String mobileName, String osType, int batterySize) {
		this.mobileName = mobileName;
		this.osType = osType;
		this.batterySize = batterySize;
	}
	
	// 사용
	public abstract int operate(int time);
	
	// 충전
	public abstract int charge(int time);


	
	
	
	
	
	
	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}



	
	
	
	
	
	
	
	
	
}
