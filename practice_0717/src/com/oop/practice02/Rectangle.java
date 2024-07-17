package com.oop.practice02;

public class Rectangle extends Shape implements Resize{

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		setHeight(getWidth() + size);
	}


	@Override
	public String toString() {
		return super.toString() + getArea();
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}
	

}
