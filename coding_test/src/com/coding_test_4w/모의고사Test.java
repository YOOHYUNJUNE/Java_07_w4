package com.coding_test_4w;

import java.util.*;

public class 모의고사Test {
    public int[] solution(int[] answers) {
        // 학생의 답안 패턴 배열
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 학생의 정답 수
        int oneSol = 0;
        int twoSol = 0;
        int threeSol = 0;

        // 문제 배열의 길이
        int n = answers.length;

        // 각 학생의 답안을 정답 배열 길이에 맞게 반복
        int[] oneEx = new int[n];
        int[] twoEx = new int[n];
        int[] threeEx = new int[n];

        // 1번 학생 답안 배열 생성
        if (one.length >= n) {
            oneEx = Arrays.copyOf(one, n);
        } else {
            System.arraycopy(one, 0, oneEx, 0, one.length);
            for (int i = one.length; i < n; i++) {
                oneEx[i] = one[i % one.length];
            }
        }

        // 2번 학생 답안 배열 생성
        if (two.length >= n) {
            twoEx = Arrays.copyOf(two, n);
        } else {
            System.arraycopy(two, 0, twoEx, 0, two.length);
            for (int i = two.length; i < n; i++) {
                twoEx[i] = two[i % two.length];
            }
        }

        // 3번 학생 답안 배열 생성
        if (three.length >= n) {
            threeEx = Arrays.copyOf(three, n);
        } else {
            System.arraycopy(three, 0, threeEx, 0, three.length);
            for (int i = three.length; i < n; i++) {
                threeEx[i] = three[i % three.length];
            }
        }

        // 정답 비교
        for (int i = 0; i < n; i++) {
            if (oneEx[i] == answers[i]) {
                oneSol++;
            }
            if (twoEx[i] == answers[i]) {
                twoSol++;
            }
            if (threeEx[i] == answers[i]) {
                threeSol++;
            }
        }

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

        // 리스트를 배열로 변환
        int[] answer = top.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
