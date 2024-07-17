package com.reference.list;

public class ListPractice3 {

	public static void main(String[] args) {
		String[] subjects = { "HTML", "CSS", "JavaScript", "Java", "CS" };
		
		// for 반복을 돌려라 (향상된 방법)
		// 반복하면서 Java라는 글자가 있으면 출력하고 없으면 넘어가라
		for (String subject : subjects) {
//			if (subject.contains("Java")) {
//				System.out.println(subject);
//			}
			if (subject.indexOf("Java") < 0) {
				continue;
			}
			System.out.println(subject);
		}
	}

}
