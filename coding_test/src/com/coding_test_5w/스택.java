package com.coding_test_5w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class 스택 {
	public static void main(String[] args) throws IOException {
		
		// 정수를 저장하는 스택
		// 명령어
		// 1. push X : 정수 X를 스택에 [넣음]
		// 2. pop : 가장 위의 정수를 [빼서] [출력]. 정수가 없으면 [-1] 출력
		// 3. size : 스택에 있는 정수 [개수] 출력
		// 4. empty : 스택이 비면 [1], 아니면 [0] 출력
		// 5. top : 스택 가장 위 정수. 없으면 [-1] 출력
		
		// 첫 줄에는 명령의 수
		// 이후 명령어
		
		// 스택으로 사용할 배열
		List<Integer> s = new LinkedList<>();
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("명령 개수 입력");
		int order = Integer.parseInt(rd.readLine());
		
		// 명령 개수만큼 명령을 입력
		for (int i=0; i<order; i++) {
			System.out.println("명령을 입력하세요.");
			String input = rd.readLine(); // 명령			
		
			// 입력값에 대한 조건문
			
			// 1. push X : 정수 X를 스택에 [넣음]
			if (input.startsWith("push ")) {
				String pushStr = input.substring(5); // "push " 이후 문자를 가져옴 : 정수 n을 넣는 명령어
				int cgOrder = Integer.parseInt(pushStr); // 정수로 변환
				s.add(cgOrder);
			}
		
			
			// 2. pop : 가장 위의 정수를 [빼서] [출력]. 정수가 없으면 [-1] 출력
			if (input.startsWith("pop")) {
				if (s.isEmpty()) {
					System.out.println(-1);
				} else {
				System.out.println(s.get(s.size()-1));
				s.remove(s.size()-1);
				}
			}
			
			
			// 3. size : 스택에 있는 정수 [개수] 출력
			if (input.startsWith("size")) {
				System.out.println(s.size());
			}
			
			
			// 4. empty : 스택이 비면 [1], 아니면 [0] 출력
			if (input.startsWith("empty")) {
				System.out.println(s.isEmpty() ? 1 : 0);
			}
			
			
			// 5. top : 스택 가장 위 정수. 없으면 [-1] 출력
			if (input.startsWith("top")) {
				if (s.isEmpty()) {
					System.out.println(-1);
				} else {
				System.out.println(s.get(s.size()-1));
				}
			}
			
			
			
		}
		System.out.println(s);
		
		
		
		
		
		
	}
}
