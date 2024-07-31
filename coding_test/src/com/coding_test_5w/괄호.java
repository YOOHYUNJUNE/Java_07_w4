package com.coding_test_5w;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 괄호 {
    public static void main(String[] args) {

		// 괄호 "( )" 열고 닫히면 YES / 아니면 NO 출력
		// true : YES / false : NO

		// "(" 입력시 false 저장, ")" 로 닫으면 true
		// 가장 처음에 ) 입력시 false
    	
        Scanner sc = new Scanner(System.in);

        // 괄호를 넣을 배열
        List<String> arr = new ArrayList<>();

        // 괄호 입력 횟수
        System.out.println("괄호 테스트 데이터 횟수");
        int test = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < test; i++) {
            System.out.println("괄호를 입력하세요.");
            String b = sc.nextLine();
            arr.add(b);

            // 음수가 되면(닫는 괄호가 더 많으면) 즉시 NO
            int exit = 0;
            boolean yes = true;

            // j < 배열에 저장된, 입력된 괄호의 길이만큼
            for (int j = 0; j < arr.get(i).length(); j++) {
                if (arr.get(i).charAt(j) == '(') {
                	exit++;
                } else if (arr.get(i).charAt(j) == ')') {
                	exit--;
                }

                // 닫는 괄호가 더 많으면 즉시 false
                if (exit < 0) {
                	yes = false;
                    break;
                }
            }

            if (yes && exit == 0) { // 균형 맞는 경우
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
