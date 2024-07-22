package com.collection.set;

import java.util.*;

public class SetExample3 {
	public static void main(String[] args) {
		
		Set<String> cookies = new HashSet<>();
		
		cookies.add("맛동산");
		cookies.add("새우깡");
		cookies.add("허니버터칩");
		cookies.add("꼬북칩");
		cookies.add("초코하임");
		
//		for (String cookie : cookies) {
//			System.out.println(cookie);
//		}
		
		// 반복자 : iterator
		Iterator<String> iterator = cookies.iterator();
		
		// 끝날 때까지 계속 반복
		while (iterator.hasNext()) {
			String cookie = iterator.next();
			System.out.println(cookie);
		}
		
		
		
		
		
		
		
		
	}
}
