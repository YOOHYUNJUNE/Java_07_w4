package com.practice;

public class BookExample {
	public static void main(String[] args) {
		
		BookManagementSystem system = new BookManagementSystem();
		
		// 책 추가
        system.addBook("Effective Java", "978-0134685991", "Joshua Bloch", 2018, "Programming");
        system.addBook("Effective Java", "978-0134685991", "Joshua Bloch", 2018, "Programming");
        system.addBook("Clean Code", "978-0132350884", "Robert C. Martin", 2008, "Programming");

        system.listBooks();
        
        System.out.println();

        // 업데이트
        system.updateBook("978-0134685991", "Effective Java (3rd Edition)", "Joshua Bloch", 2018, "Programming");
        System.out.println();
        
        // 찾기(제목 또는 isbn)
        system.searchBook("978-0134685991");
        system.searchBook("Effective Java (3rd Edition)");

        System.out.println();
        
        // 제거
        system.removeBook("978-0132350884");
        system.listBooks();
		        
		        
		        
	}
}
		