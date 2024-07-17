package com.oop.practice01;

public class L3 extends Car implements Temp {

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	// 10 주행당 1 oilSize 감소
	@Override
	public void go(int distance) {
		setDistance(getDistance() + distance);
		setOilSize(getOilSize() - distance/10);
	}

	@Override
	public void setOil(int oilSize) {
		super.setOil(oilSize);
	}

	@Override
	public int getTempGage(int distance) {
		return distance / 10;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "temperature=" + getTempGage(getDistance());
	}

	
	
	
	
}
