package com.oop.practice01;

public abstract class Car implements Temp {
	
	// 인스턴스 필드 선언
	String name, engine;
	int oilTank; // 사이즈 
	int oilSize; // 주유된 양
	int distance; // 주행 거리
	
	public Car() {}
	
	// 5개 클래스변수를 받는 생성자
	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	
	// 추상 메소드
	// 주행
	// public abstract로 가능
	public void go(int distance) {
		setOilSize(getOilSize() - distance);
	}
	
	
	// 주유
	public void setOil(int oilSize) {
		setOilSize(getOilSize() + oilSize);
	}

	
	
	@Override
	public String toString() {
		return "name=" + name + ", engine=" + engine + ", oilTank=" + oilTank + ", oilSize=" + oilSize
				+ ", distance=" + distance + ", " ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getOliTank() {
		return oilTank;
	}

	public void setOliTank(int oliTank) {
		this.oilTank = oliTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
	
	
	
	
	
	

}
