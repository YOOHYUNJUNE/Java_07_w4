package com.lambda4;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonExample {
	public static void main(String[] args) {
		
//		// 파일을 생성해야하는 방법
//		TreeSet<Person> treeSet = new TreeSet<>(new Comparator<> ());
	
//		// 다른 파일을 만들지 않고 쓰는 방법 new TreeSet<>() {내용}
//		TreeSet<Person> treeSet = new TreeSet<>(new Comparator<> () {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		}); 
		
//		// 오버라이딩까지 생략
//		TreeSet<Person> treeSet = new TreeSet<>((o1, o2) -> {
//			// 같으면 0 / (작으면)오름차순: 음수 / (크면)내림차순: 양수
//			return o1.getAge() - o2.getAge();
//		});
		
		// Comparator : static 메소드
		TreeSet<Person> treeSet = new TreeSet<>(Comparator.comparingInt(Person::getAge));
		
		treeSet.add(new Person("권길동", 7));
		treeSet.add(new Person("김길동", 8));
		treeSet.add(new Person("성길동", 6));

		System.out.println(treeSet);
		
	}
}
