package com.yedam.hsw.classes;

public class CalendarRee {

	public static void main(String[] args) {
		
		int month=4;
		String[] day = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int days = getMonthDay(month);
		int firstDay = getFirstday(month);
		System.out.println(month + "월은"+ getMonthDay(month) );
		for (int i=0; i<day.length;i++) {
			System.out.print("  "+day[i]);
		}System.out.println();
		for (int i =0; i<firstDay-1; i++) {
			System.out.println("    ");
		}
		for (int i=1; i<=days; i++) {
			System.out.printf("%4d", i);
			if ((firstDay-1+i)%7 ==0)
				System.out.println();
		
		}
		
		
	}
	
	static int getFristDay(int month) {
		if (month == 1) {
			return 4;
		} else if (month == 2) {
			return 7;
		} else if (month == 3) {
			return 1;
		} else if (month == 4) {
			return 4;
		} else if (month == 5) {
			return 5;
		} else if (month == 6) {
			return 6;
		} else if (month == 7) {
						return 7;
		}else {
			return 0;
		}
	}

	static int getMonthDay(int month) {
		int days =0;
		if (month <=7 && month%2==1) {
		}else if(month>7 && month%2==0) {
			days=31;
		}else if (month ==2) {
			days =28;
		}else {
			days=30;
		}return days;
	}
	
	
}
