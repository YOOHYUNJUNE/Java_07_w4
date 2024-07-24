package com.assignment;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class BookComparator {

	// 제목 기준 정렬
	public static Comparator<Book> byTitle() {
//		return Comparator.comparing(Book::getTitle);
//		return Comparator.comparing(book -> book.getTitle());
//		return Comparator.comparing(new Function<Book, String>() {
//			@Override
//			public String apply(Book b) {
//				return b.getTitle();
//			}
//		});
		return new Comparator<Book>() {
			
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
		};

	}
	
	// 글쓴이 기준 정렬
	public static Comparator<Book> byAuthor() {
		return Comparator.comparing(Book::getAuthor);
	}
	
	// 출판년도 기준 정렬
	public static Comparator<Book> byYear() {
		return Comparator.comparing(Book::getYear);
	}
	
	// 쪽수 기준 정렬
	public static Comparator<Book> byPages() {
		return Comparator.comparing(Book::getPages);
	}
	
	
	
	
}
