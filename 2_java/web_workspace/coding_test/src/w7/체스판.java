package w7;

import java.util.Scanner;

public class 체스판 {
	public static void main(String[] args) {
		
		// n 가로 * m 세로 (>=8) 체스판 W,B 입력 
		// WB 또는 BW가 아니면 +1
		
		// 체스판 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("체스판 입력 : ");
		String mn = sc.nextLine();
		String[] parts = mn.split(" ");
		
		int m = Integer.parseInt(parts[0]);
		int n = Integer.parseInt(parts[1]);
		int count = 0;
		
		for (int i=0; i<m; i++) { // m: 세로
			System.out.println("체스 줄 입력");
			String line = sc.nextLine(); // WBWBWB 등 : n과 길이가 같아야 함.
			
			// 색칠할 필요가 없는 경우 ; 
			
		}
		
		
		
		
		
		
		
		
		
	}
}
