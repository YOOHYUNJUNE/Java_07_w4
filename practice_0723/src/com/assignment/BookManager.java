package com.assignment;

import java.util.*;

public class BookManager {
	private List<Book> books;
	
	public BookManager() {
		this.books = new ArrayList<Book>();
	}
	
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		
	}
	
	// 정렬
	public void sortBooksBy(Comparator<Book> comparator) {	
	}
	

	
	// Stack<Book> getStack()
	// 스택 생성해 Books의 book들을 모두 스택에 넣고 반환

	// Queue<Book> getQueue()
	// 큐를 생성해 Books의 book들을 모두 큐에 넣고 반환
	
	// Map<String, Book> getBookMap()
	// HashMap 생성해 Books의 book들을 모두 맵<제목, Book>에 넣고 반환
	
	// TreeMap<String, Book> getBookTreeMap()
	// HashMap 생성해 Books의 book들을 모두 트리맵<제목, Book>에 넣고 반환
	
	// TreeSet getBookTreeSet()
	// TreeSet 생성해 Books의 book들을 모두 트리셋에 넣고 반환
	public TreeSet<Book> getBookTreeSet() {
		TreeSet<Book> bookTreeSet = new TreeSet<>(books);
		return bookTreeSet;
	}
	
	
	
	
	
	
	
	
}
