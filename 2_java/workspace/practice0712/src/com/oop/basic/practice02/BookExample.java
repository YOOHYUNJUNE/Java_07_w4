package com.oop.basic.practice02;

public class BookExample {
	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus", 50000, 5.0);
		Book b2 = new Book("Java SE 17", 40000, 3.0);
		Book b3 = new Book("JSP Servlet", 60000, 6.0);
		
		Book[] bookArr = {b1, b2, b3};
		
		System.out.println("책이름\t가격\t할인율\t할인후금액");
		System.out.println("------------".repeat(5));
		
		for(Book b: bookArr) {
			System.out.println(
					b.bookName + "\t" + 
					b.bookPrice + "원\t" +
					b.bookDiscountRate + "%\t" +
					b.getDiscountBookPrice() + "원"
			);
		}
	}
}
