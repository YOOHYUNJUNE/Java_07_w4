package com.practice;

import java.util.Scanner;

public class BookExample2 {
	public static void main(String[] args) {
		BookManagementSystem system = new BookManagementSystem();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while(run) {
        	System.out.print("1. 도서 추가 | 2. 도서 삭제 | 3. 도서 업데이트 | 4. 도서 목록조회 | 5. 도서 검색 | 6. 종료");
        	int input = sc.nextInt();
        	String isbn, title, author, category;
        	int year;
        	switch (input) {
        		case 1:
        			isbn = getTextInput("ISBN");
        			title = getTextInput("제목");
        			author = getTextInput("지은이");
        			year = Integer.parseInt(getTextInput("발행연도"));
        			category = getTextInput("카테고리");
        			system.addBook(title, isbn, author, year, category);
        			break;
        		case 2: 
        			isbn = getTextInput("ISBN");
        			system.removeBook(isbn);
        			break;
        		case 3:
        			isbn = getTextInput("ISBN");
        			title = getTextInput("제목");
        			author = getTextInput("지은이");
        			year = Integer.parseInt(getTextInput("발행연도"));
        			category = getTextInput("카테고리");
        			system.updateBook(isbn, title, author, year, category);
        			break;
        		case 4:
        			system.listBooks();
        			break;
        		case 5:
        			String isbnOrTitle = getTextInput("ISBN 또는 제목");
        			system.searchBook(isbnOrTitle);
        			break;
        		case 6:
        			run = false;
        			break;
        	}
        }
	}
	
	public static String getTextInput(String key) {
		Scanner sc = new Scanner(System.in);
		System.out.print(key + " 을/를 입력하세요");
		return sc.nextLine();
	}
}
