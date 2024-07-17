package com.statement.loop;

// 바깥쪽까지 종료시키기 : break label
public class BreakExample3 {
	public static void main(String[] args) {
		Outter : for (char upper='A'; upper <= 'Z'; upper++) {
			for (char lower='a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				if (lower == 'e') {
					break Outter; // lower 종료 시 upper도 종료
				}
			}
		}
	}
}
