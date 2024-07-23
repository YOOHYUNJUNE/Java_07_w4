package com.coding_test_4w;

import java.util.*;


public class 모의고사 {
public static void main(String[] args) {
		
//// 프로그래머스식
//class Solution {
//    public int[] solution(int[] answers) {
//        int[] answer = {};
		
		// 1번 학생 : 1 2 3 4 5 반복
		// 2번 학생 : 2 1 2 3 2 4 2 5 반복
		// 3번 학생 : 3 3 1 1 2 2 4 4 5 5 반복
		
		// 문제 배열 주어질때, 가장 많이 맞춘 사람(중복시 전부 표시)
		// 문제 답은 1 ~ 5
		
		Scanner sc = new Scanner(System.in);
		// 배열 크기 선정
		System.out.println("배열 크기를 정해주세요.");
		int n = sc.nextInt();
//		프로그래머스식
//		int n = answer.length;
		
		int[] sol = new int[n];
		for (int i=0; i<n; i++) {
			
			// 직접 입력
			int number = sc.nextInt();
			sol[i] = number;
//			// 정답 1~5 랜덤 입력
////			int number = (int) (Math.random()*5 + 1);
		}
		
		System.out.println("정답 : " + Arrays.toString(sol));
		
		// 1번 학생
		int[] one = {1, 2, 3, 4, 5};
		int[] oneEx = new int[n]; // 정답 배열 길이가 더 길 경우 각 새로운 배열
		int oneSol = 0; // 학생의 정답 수

		// 2번 학생
		int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] twoEx = new int[n];
		int twoSol = 0;

		// 3번 학생
		int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] threeEx = new int[n];
		int threeSol = 0;
	
		
		// Arrays.copyOf(arr, n)
		// 정답 배열 길이가 학생보다 짧으면, 학생 = 학생[n] 
		
		/////////////////////////////////////////////
		// 1번 학생
		if (one.length >= sol.length) {
			oneEx = Arrays.copyOf(one, n);
		// 정답 배열 길이가 학생보다 길면, 학생 배열 반복
		} else {
			// 정답 배열이 더 길 경우 새 one 배열 생성
			// System.arraycopy(원본배열, 복사시작위치, 새배열, 붙여넣기시작위치, 복사개수);
			System.arraycopy(one, 0, oneEx, 0, one.length);
			for (int i=one.length; i<n; i++) {
				oneEx[i] = one[i%one.length];
			}	
		}
//		System.out.println("학생 : " + Arrays.toString(oneEx));
		
		// 2. Ex배열을 다시 정답 배열에 대입
		for (int i=0; i<n; i++) {
			if(oneEx[i] == sol[i]) {
				oneSol++;
			}
		}
//		System.out.println("맞은 수: " + oneSol);
		
		////////////////////////////////////////
		// 2번 학생
		if (two.length >= sol.length) {
			twoEx = Arrays.copyOf(two, n);
		} else {
			System.arraycopy(two, 0, twoEx, 0, two.length);
			for (int i=two.length; i<n; i++) {
				twoEx[i] = two[i%two.length];
			}	
		}
		for (int i=0; i<n; i++) {
			if(twoEx[i] == sol[i]) {
				twoSol++;
			}
		}
		
		
		////////////////////////////////////////
		// 3번 학생
		if (three.length >= sol.length) {
			threeEx = Arrays.copyOf(three, n);
		} else {
			System.arraycopy(three, 0, threeEx, 0, three.length);
			for (int i=three.length; i<n; i++) {
				threeEx[i] = three[i%three.length];
			}	
		}
		for (int i=0; i<n; i++) {
			if(threeEx[i] == sol[i]) {
				threeSol++;
			}
		}
		
//		System.out.println(Arrays.toString(threeEx));
//		System.out.println(threeSol);
		
		
		// 정답 수 비교, 가장 높은 점수 학생 출력 else 동일 점수 학생 출력(오름차순 정렬)

		// 학생 점수를 담은 배열
		int[] score = new int[3];
		score[0] = oneSol;
		score[1] = twoSol;
		score[2] = threeSol;
		
		// 최고점
		int maxScore = Math.max(oneSol, Math.max(twoSol, threeSol));
		
		// 최고점 학생
		List<Integer> top = new ArrayList<>();
		if (oneSol == maxScore) {
			top.add(1);
		}
		if (twoSol == maxScore) {
			top.add(2);
		}
		if (threeSol == maxScore) {
			top.add(3);
		}

		// 프로그래머스식
//		return answer;
		
		System.out.println(top);
		
		
		
		
		
		
		
    }
		
    }
//}

