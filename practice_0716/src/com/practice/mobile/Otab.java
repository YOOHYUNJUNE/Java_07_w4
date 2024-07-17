package com.practice.mobile;

public class Otab extends Mobile {
	
	public Otab() {}

	public Otab(String mobileName, String osType, int batterySize) {
		super(mobileName, osType, batterySize);
	}
	
	
	int battery;
	
	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize() - 12 * time);
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize() + 8 * time);
		return getBatterySize();
	}



}
