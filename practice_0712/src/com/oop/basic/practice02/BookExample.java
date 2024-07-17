package com.oop.basic.practice02;

public class BookExample {
	public static void main(String[] args) {
		
		Book A = new Book("SQL PLUS", 50000, 5.0);
		Book B = new Book("Java 2.0", 40000, 3.0);
		Book C = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책이름 \t\t 가격 \t할인율 \t 할인후 금액");
		System.out.println("-------------------------------------------------");
		
		Book[] bookArr = {A, B, C};
		for (Book id : bookArr) {
			System.out.println(id.bookName + "\t" + id.bookPrice + "원\t" + id.bookDiscountRate + "%\t" + id.getDiscoutBookPrice() + " 원");
		}
		
	
	}
}
