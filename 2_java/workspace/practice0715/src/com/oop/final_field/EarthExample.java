package com.oop.final_field;

public class EarthExample {
	public static void main(String[] args) {
		System.out.println("지구의 반지름:" + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적:" + Math.round(Earth.EARTH_SURFACE_AREA) + "km^2");
	}
}
