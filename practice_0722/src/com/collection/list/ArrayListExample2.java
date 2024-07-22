package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		// Board를 요소로 갖는 ArrayList 생성
		List<Board> list = new ArrayList<> ();
		
		// 제목1, 내용1, 글쓴이1 ... 5개
		Board b1 = new Board ("제목1", "안녕하세요1", "글쓴이1");
		Board b2 = new Board ("제목2", "안녕하세요2", "글쓴이2");
		Board b3 = new Board ("제목3", "안녕하세요3", "글쓴이3");
		Board b4 = new Board ("제목4", "안녕하세요4", "글쓴이4");
		Board b5 = new Board ("제목5", "안녕하세요5", "글쓴이5");
		
		// 객체 추가
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		
		// 저장된 객체 총 개수 출력
		System.out.println(list.size());
		
		// 객체 내용 전체 출력
		System.out.println(list);
		
		System.out.println();
			
		// 2번째 객체 요소 삭제 
		list.remove(1);
		
		
		// 2번째 인덱스의 객체 가져와서 출력
		System.out.println(list.get(1));
		
		// 반복문을 통해 하나씩 객체 출력
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
