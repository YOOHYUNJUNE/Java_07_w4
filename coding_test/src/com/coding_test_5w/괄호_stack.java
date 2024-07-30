package com.coding_test_5w;

import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;

public class 괄호_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = 5;  // 예시로 5로 설정
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = 0; i < test; i++) {
            System.out.println("괄호를 입력하세요.");
            String b = sc.nextLine();
            arr.add(b);

            // 스택을 이용한 괄호 유효성 검사
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (int j = 0; j < arr.get(i).length(); j++) {
                char current = arr.get(i).charAt(j);

                if (current == '(') {
                    stack.push(current);
                } else if (current == ')') {
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }

                // 연속된 두 개 이상의 ')' 검사
                if (j + 2 < arr.get(i).length() && arr.get(i).charAt(j) == ')' && arr.get(i).charAt(j + 1) == ')' && arr.get(i).charAt(j + 2) == ')') {
                    System.out.println("NO");
                    isValid = false;
                    break;
                }
            }

            if (isValid && stack.isEmpty()) {
                System.out.println("YES");
            } else if (isValid) {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
