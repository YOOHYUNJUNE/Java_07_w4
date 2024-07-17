package com.enumeration;

import java.util.Calendar;

public class EnumExample3 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		Week todayWeek = null;
		
		todayWeek = switch(week) {
			case 1 -> Week.SUNDAY;
			case 2 -> Week.MONDAY;
			case 3 -> Week.TUESDAY;
			case 4 -> Week.WEDNESDAY;
			case 5 -> Week.THURSDAY;
			case 6 -> Week.FRIDAY;
			case 7 -> Week.SATURDAY;
			default -> null;
		};
		
		if (todayWeek == Week.SUNDAY) {
			System.out.println("쉬는 날입니다.");
		} else {
			System.out.println("열심히 공부하세요.");
		}
	}

}
