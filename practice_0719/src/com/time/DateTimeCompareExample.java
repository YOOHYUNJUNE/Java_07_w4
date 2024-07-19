package com.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		// 특정 날짜 지정
		LocalDateTime start = LocalDateTime.of(2024, 7, 1, 0, 0, 0);
		LocalDateTime end = LocalDateTime.of(2024, 11, 11, 0, 0, 0);
		
		
		if (now.isBefore(start)) {
			System.out.println("강의 전");
		} else if (now.isAfter(end)) {
			System.out.println("강의 종료");
		} else {
			System.out.println("강의 중");
			long remainDays = now.until(end, ChronoUnit.DAYS);
			System.out.println("남은 날 : " + remainDays);
		}
		
		
		
		
	}
}
