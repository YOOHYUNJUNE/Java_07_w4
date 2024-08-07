package w6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 색종이 {
	public static void main(String[] args) throws IOException {
		
		// 색이 서로 다른 직사각형 색종이 n장 순서대로
		// n장 색종이가 주어진 위치에 차례로 놓일 때, 각 색종이가 보이는 부분의 면적
		
		// 입력 첫줄 : 색종이 장수 n
		// 다음 줄 : 각 색종이 정보 (가장 왼쪽 아래칸 위치 a b, 가로c, 세로 2)
		// [1] 0 0 10 10 : 100 -> 64
		// [2] 2 2 6 6 : 36
		
		
		// 좌표를 어떻게 표시할 것인가 : 리스트?
		// 0 0 2 2 : [ {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2} ]
		// for문으로 리스트에 좌표 전부 넣기
		
		// 색종이 수 n에 따라 겹치는 부분은 지우기 : 겹치는 부분 삭제는 어떻게?
			// for문 돌며 겹치는 부분이 있으면 n-1 색종이의 좌표 삭제
		
		// 마지막 색종이 a b c d 에서 c * d 출력
		
		
		
		/////////////제현님 풀이
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		// 좌표 전부를 설정
		int[][] paper = new int[1001][1001]; 
		
		for (int i=1; i<n+1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			// 2차원 배열 [y~h][x~h] -> 각 좌표들을 i로 지정
			for (int j=y; j<y+h; j++) {
				for (int k=x; k<x+w; k++) {
					paper[j][k] = i;
				}
			}
			
		}
		
	
		for (int i=1; i<n+1; i++) {
			int count = 0; // 넓이
			
			// 완전 탐색
			for (int j=0; j<1001; j++) {
				for (int k=0; k<1001; k++) {
					// 좌표가 i랑 일치하면 넓이로 포함시켜서 더함
					if (paper[j][k] == i) {
						count += 1;
					};
				}
			}			
			System.out.println(count);
		
		}
		
	}
}
