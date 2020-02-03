package com.yedam.hsw.classes;

import java.util.Calendar;

public class CalendarExample {
	
	public static void main(String[] args) {

		int year, month;
		year =2020;
		month=2;
	//	creathCal(year, month);
		
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 년도:" + cal.get(Calendar.YEAR));
		System.out.println("현재 월:" + cal.get(Calendar.MONTH));
		System.out.println("현재 날짜:" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("현재 요일:" + cal.get(Calendar.DAY_OF_WEEK));

		cal.set(2020, 0, 1);
		System.out.println("현재 년도:" + cal.get(Calendar.YEAR));
		System.out.println("현재 월:" + cal.get(Calendar.MONTH));
		System.out.println("현재 날짜:" + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("현재 요일:" + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("전체 일수:" + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
