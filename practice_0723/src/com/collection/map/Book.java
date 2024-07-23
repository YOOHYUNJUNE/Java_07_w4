package com.collection.map;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// 사용자가 만들 클래스는 Comparable 해야 정렬됨
// String은 자동
public class Book implements Comparable<Book> {

	private String title, isbn;
	private int year;
	
//	주어진 객체와 같으면 return 0
//	주어진 객체보다 작으면 음수 반환
//	주어진 객체보다 크면 양수 반환
	@Override
	public int compareTo(Book o) {
//		return Integer.valueOf(this.year).compareTo(o.getYear()); // int라서 String으로 변경
//		return this.title.compareTo(o.getTitle()); 
		
		// 제목 글자수 오름차순 정렬
		Integer thisTitleLength = this.title.length();
		Integer otherTitleInteger = o.getTitle().length();
		return thisTitleLength.compareTo(otherTitleInteger);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
