package w6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 폴리오미노 {
	public static void main(String[] args) {
		
		// AAAA
		// BB
		// 보드판 ".", "X"로 이루어져있음
		// X가 4개면 AAAA, 2개면 BB, 홀수면 -1
		
		// XXXX -> AAAA
		// XXXXX -> -1
		// XXXXXX -> AAAABB
		// XX.XXXXXX -> BB.AAAABB
		
		Scanner sc = new Scanner(System.in);
		
		// 보드판
		System.out.println("보드판 입력 : ");
		String str = sc.nextLine();
		
		// 보드판 넣을 리스트
		List<String> arr = new ArrayList<>();
		arr.add(str);
		
		System.out.println(arr);
		System.out.println(arr.size());
		
		// 리스트를 순회
		for (int i=0; i<arr.get(0).length(); i++) {
			// XX 가 충족 되지 않는 경우 즉시 -1
			if (i < 1) {
				System.out.println(-1);				
			} else if (i == 1) {
				if (arr.get(0).charAt(i) =='X' && arr.get(0).charAt(i+1) == 'X') {
					System.out.println("BB");
				} else {
					System.out.println(-1);
				}
			} else if (i > 3) { // XXXX 이상
				if (arr.get(0).charAt(i) =='X' && arr.get(0).charAt(i+1) == 'X' &&
					arr.get(0).charAt(i+2) =='X' && arr.get(0).charAt(i+3) == 'X') {
				} else if (arr.get(0).charAt(i) =='X' && arr.get(0).charAt(i+1) == 'X') {
					System.out.println("TEST");
				} 
				
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
	}
}
