package com.practice;

import java.util.*;

public class BookManagementSystem {

	private List<Book> books;
	private Set<String> bookIsbns;
	private Map<String, Book> bookMap;
	
	
	public BookManagementSystem() {
		this.books = new ArrayList<>();
		this.bookIsbns = bookIsbns = new HashSet<>();
		this.bookMap = bookMap = new HashMap<>();
	}
	
	// 메소드

	// 도서 추가
	// isbn은 중복되지 않아야.
	// 같은 isbn 있으면 오류 메시지
	public void addBook(String title, String isbn, String author, int year, String category) {
		if (bookIsbns.contains(isbn)) {
			System.out.println("이미 존재하는 책입니다.");
			return;
		} else {
			Book b = new Book(title, isbn, author, year, category);
			books.add(b);
			bookIsbns.add(isbn);
			bookMap.put(isbn, b);
		}
	}
	
//	// 도서 삭제 : Map
//	// isbn을 입력받아 해당 isbn 삭제
//	public void removeBook(String isbn) {
//		for (Book b : books) {
//			if (isbn.equals(b.getIsbn())) {
//				books.remove(b);
//				break;
//			}
//		}
//		bookIsbns.remove(isbn);
//	}
	// 선생님 코드
	public void removeBook(String isbn) {
		Book b = bookMap.get(isbn);
		if (b != null) {
			books.remove(b);
			bookIsbns.remove(isbn);
			bookMap.remove(isbn);
		} else {
			System.out.println("해당 책을 찾을 수 없습니다.");
		}
	}
	

	
//	// 도서 업데이트
//	// isbn 입력받아 해당 isbn 업데이트
//	// 제목, 저자, 출판연도, 카테고리 업데이트
//	public void updateBook(String isbn, String newTitle, String newAuthor, int newYear, String newCategory) {
//		for (Book b : books) {
//			if(b.getIsbn().equals(isbn)) {
//				System.out.println("책 정보를 갱신합니다. : " + isbn + "\t");
//				b.setTitle(newTitle);
//				b.setAuthor(newAuthor);
//				b.setYear(newYear);
//				b.setCategory(newCategory);
//			}
//			return;
//		}
//		System.out.println("해당 책을 찾을 수 없습니다.");
//	}
	// 선생님 코드
	public void updateBook(String isbn, String newTitle, String newAuthor, int newYear, String newCategory) {
		Book b = bookMap.get(isbn);
		if (b != null) {
			b.setTitle(newTitle);
			b.setAuthor(newAuthor);
			b.setYear(newYear);
			b.setCategory(newCategory);
			// isbn은 갱신 X
		} else {
			System.out.println("해당 책을 찾을 수 없습니다.");
		}
	}
	
	
	// 도서 목록 조회
	// 전체 도서 목록 출력
	public void listBooks() {
		System.out.println("------------------------\n 전체 도서 목록 \n------------------------");
		for (Book b : books) {
			System.out.println(b);
		}
	}
	
//	// 특정 도서 검색
//	// isbn 또는 제목 입력받아 해당 도서 검색, 도서 정보 출력
//	public void searchBook(String isbnOrTitle) {
//
//		// 제목으로 검색
//		for (Book bTitle : books) {
//			if (bTitle.getTitle().equals(isbnOrTitle)) {
//				System.out.print("제목으로 검색합니다. : " + isbnOrTitle + "\t");
//				System.out.println(bTitle);
//			}
//		}
//		
//		// ISBN으로 검색
//		for (Book bIsbn : books) {
//			if (bIsbn.getIsbn().equals(isbnOrTitle)) {
//				System.out.print("ISBN으로 검색합니다. : " + isbnOrTitle + "\t");
//				System.out.println(bIsbn);
//			}
//		}
//		
//		return;
//	}
	// 선생님 코드
	public void searchBook(String isbnOrTitle) {
		Book b = bookMap.get(isbnOrTitle);
		if (b != null) {
			System.out.println("\n ISBN으로 검색 : ");
			System.out.println(b);
			return;
		}
		for (Book i : books) {
			if (i.getTitle().contains(isbnOrTitle)) {
				System.out.println("\n 제목으로 검색 : ");
				System.out.println(i);
				return;
			}
		}
		System.out.println("검색 결과 없음");
	}
	
	
	
	
	
}
