package com.assignment;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
//public class Book implements Comparable<Book>{

	private String title, author;
	private int year, pages;
	
//	@Override
//	public int compareTo(Book o) {
//		return title.compareTo(o.getTitle());
//	}
	

	
}
