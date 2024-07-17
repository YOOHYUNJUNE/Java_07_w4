package com.oop.practice5.library.book;

public class Book {
	
	String title;
	String name;
	String isbn;
	static int BookCount = 0;
	
	public Book() {}
	
	public Book(String title, String name, String isbn) {
		this.title = title;
		this.name = name;
		this.isbn = isbn;
		BookCount++;
	}
	

	public void printBookInfo() {
		System.out.println("이름 : " + title + " 저자 : " + name + " 국제표준코드 : " + isbn);
	}
	
	public static int getBookCount() {
		return BookCount;
	}
	
	
	
	
	
	
	
}
