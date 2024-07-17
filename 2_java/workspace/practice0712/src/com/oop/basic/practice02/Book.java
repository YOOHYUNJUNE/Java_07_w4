package com.oop.basic.practice02;

public class Book {
	String bookName;
	int bookPrice;
	double bookDiscountRate;
	
	public Book() { }

	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	double getDiscountBookPrice() {
		double result = 0.0;
		result = bookPrice * (100 - bookDiscountRate) / 100;
		return result;
	}
	
	
}
