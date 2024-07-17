package com.oop.practice5.library.book;

public class Book {
	String title, author, isbn;
	static int bookCount;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		bookCount++;
	}
	
	public void printBookInfo() {
		System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
	}

	public static int getBookCount() {
		return bookCount;
	}	
	
}
