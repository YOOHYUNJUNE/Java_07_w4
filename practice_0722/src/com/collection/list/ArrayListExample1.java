package com.collection.list;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		
		// ArrayList 생성
		ArrayList<String> list = new ArrayList<> ();
		
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		
		System.out.println("초기화된 arrayList : " + list);
		
		// 특정 요소 제거
		list.remove("banana");
		System.out.println("삭제된 arrayList : " + list);
		
		// 특정 인덱스 제거
		list.remove(0);
		System.out.println("삭제된 arrayList : " + list);
		
		list.add("durian");
		System.out.println("추가된 arrayList : " + list);
		
		// 특정 위치에 추가
		list.add(0, "blueberry");
		System.out.println("0번째에 추가된 arrayList : " + list);

		// 특정 위치 요소 수정
		list.set(1, "cacao");
		System.out.println("1번쨰에 수정된 arrayList : " + list);
		
		// 포함 여부
		boolean containsCacao = list.contains("cacao");
		System.out.println("Cacao가 리스트에 있는지? : " + containsCacao);
		
		// 길이
		int size = list.size();
		System.out.println("리스트의 길이 : " + size);
		
		
		// 반복문
//		for (int i=0; i<list.size(); i++) {
//			String string = list.get(i);
//		}
		
		for (String item : list) {
			System.out.println(item);
		}
		
		// 리스트 전체 삭제
		list.clear();
		System.out.println("리스트 클리어 : " + list);
		
		
		
		
		
	}
}
