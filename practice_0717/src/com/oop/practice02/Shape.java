package com.oop.practice02;

public abstract class Shape {
	
	int width, height;
	String colors;
	
	public Shape() {}
	
	public Shape(int width, int height, String colors) {
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	
	// 넓이 구하기
	public abstract double getArea();
	
	
	
	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + ", colors=" + colors + "]";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	
	
	
	
	
	
	
	
}
