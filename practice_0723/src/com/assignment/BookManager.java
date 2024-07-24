package com.assignment;

import java.util.*;

import lombok.Getter;

@Getter
public class BookManager {
	List<Book> books;
	
	public BookManager() {
		this.books = new ArrayList<Book>();
	}
	
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	// 정렬 (comparator)
	public void sortBooksBy(Comparator<Book> comparator) {
		// sort(comparator 인터페이스) -> 인터페이스의 추상메소드를 재정의한 메소드가 동작돼 정렬
		books.sort(comparator);
	}
	
	// 스택 생성해 Books의 book들을 모두 스택에 넣고 반환
	 public Stack<Book> getStack() {
		 Stack<Book> stack = new Stack<>();
//		 for (Book b : books) {
//			 books.add(b);
//		 }
		 stack.addAll(books);
		 return stack;
	 }


	// 큐를 생성해 Books의 book들을 모두 큐에 넣고 반환
	 public Queue<Book> getQueue() {
		 Queue<Book> queue = new LinkedList<>();
		 queue.addAll(books);
//		 for (Book b : books) {
//		 	 books.add(b);
//	 	 }
		 return queue;
	 }
	 
	// HashMap 생성해 Books의 book들을 모두 맵<제목, Book>에 넣고 반환
	 public Map<String, Book> getBookMap() {
		 Map<String, Book> bookMap = new HashMap<>();
		 // putall : 배열이므로 맵으로는 전부 못 넣음
		 for (Book bh : books) {
			 bookMap.put(bh.getTitle(), bh);
		 }
		 return bookMap;
	 }
	
	// TreeMap 생성해 Books의 book들을 모두 트리맵<제목, Book>에 넣고 반환
	 public TreeMap<String, Book> getBookTreeMap() {
		 TreeMap<String, Book> treemap = new TreeMap<>();
		 for (Book bt : books) {
			 treemap.put(bt.getTitle(), bt);
		 }
		return treemap;
	 }
	
	// TreeSet 생성해 Books의 book들을 모두 트리셋에 넣고 반환
	public TreeSet<Book> getBookTreeSet() {
		TreeSet<Book> bookTreeSet = new TreeSet<>(Comparator.comparingInt(b -> b.getPages()));
//		TreeSet<Book> bookTreeSet =
//				new TreeSet<>((o1, o2) -> o1.getTitle().compareToIgnoreCase(o2.getTitle()));
////		TreeSet<Book> bookTreeSet = new TreeSet<>(new Comparator<Book>() { 
//			@Override
//			public int compare(Book o1, Book o2) {
////				return o1.getTitle().compareTo(o2.getTitle());
//				return o1.getTitle().compareToIgnoreCase(o2.getTitle()); // 대소문자까지 비교
//			}
//		});
		bookTreeSet.addAll(books);
		return bookTreeSet;
	}
	
	
	
	
	
	
	
	
}
