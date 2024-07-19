package com.stringbulider;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		// StringBuilder : 문자열 갱신
		StringBuilder sb = new StringBuilder();
		sb.append("안녕 반가워 안녕 하세요");
		
		sb.insert(6, " 정말");
		System.out.println(sb);

		sb.delete(12, 13);
		System.out.println(sb);

		sb.replace(12, 13, "방가");
		
		System.out.println(sb);
		
		
		
		
		
	}
}
