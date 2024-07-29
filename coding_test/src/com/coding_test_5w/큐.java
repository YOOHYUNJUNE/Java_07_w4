package com.coding_test_5w;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 큐 {
	public static void main(String[] args) throws IOException {
		
		// 정수를 저장하는 큐
		// 명령어
		// 1. push X : 정수 X를 큐에 [넣음]
		// 2. pop : 가장 앞의 정수를 [빼서] [출력]. 정수가 없으면 [-1] 출력
		// 3. size : 큐에 있는 정수 [개수] 출력
		// 4. empty : 큐가 비면 [1], 아니면 [0] 출력
		// 5. front : 큐 가장 앞의 정수 출력. 없으면 -1
		// 6. back : 큐 가장 뒤의 정수 출력. 없으면 -1
		
		// 첫 줄에는 명령의 수
		// 이후 명령어
		
		// 큐로 사용할 배열
		List<Integer> q = new ArrayList<>();
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("명령 개수 입력");
		int order = Integer.parseInt(rd.readLine());
		
		// 명령 개수만큼 명령을 입력
		for (int i=0; i<order; i++) {
			System.out.println("명령을 입력하세요.");
			String input = rd.readLine(); // 명령			
		
			// 입력값에 대한 조건문
			
			// 1. push X : 정수 X를 큐에 [넣음]
			if (input.startsWith("push ")) {
				String pushStr = input.substring(5); // "push " 이후 문자를 가져옴 : 정수 n을 넣는 명령어
				int cgOrder = Integer.parseInt(pushStr); // 정수로 변환
				q.add(cgOrder);
			}
		
			
			// 2. pop : 가장 앞의 정수를 [빼서] [출력]. 정수가 없으면 [-1] 출력
			if (input.startsWith("pop")) {
				if (q.isEmpty()) {
					System.out.println(-1);
				} else {
				System.out.println(q.get(0));
				q.remove(0);
				}
			}
			
			
			// 3. size : 큐에 있는 정수 [개수] 출력
			if (input.startsWith("size")) {
				System.out.println(q.size());
			}
			
			
			// 4. empty : 큐가 비면 [1], 아니면 [0] 출력
			if (input.startsWith("empty")) {
				System.out.println(q.isEmpty() ? 1 : 0);
			}
			
			
			// 5. front : 큐 가장 앞의 정수 출력. 없으면 -1
			if (input.startsWith("front")) {
				System.out.println(q.isEmpty() ? -1 : q.get(0));
			}
			
			
			// 6. back : 큐 가장 뒤의 정수 출력. 없으면 -1
			if (input.startsWith("back")) {
				System.out.println(q.isEmpty() ? -1 : q.get(q.size()-1));
			}
			
			
			
			
		}
		System.out.println(q);
		
		
		
		
		
		
	}
}
