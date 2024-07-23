package com.assignment;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {

	private String title, author;
	private int year, pages;
	
	
}
