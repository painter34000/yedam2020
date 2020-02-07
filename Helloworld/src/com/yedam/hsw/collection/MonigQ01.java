package com.yedam.hsw.collection;

import java.util.Scanner;

public class MonigQ01 {

	public static void main(String[] args) {

		System.out.println("사용 전력 입력");
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt();
		int fee = 0;

		if (w < 100) {
			System.out.println("전기요금:" + (fee += (w * 100)) + "원");

		} else if (w >= 100 && w < 201) {
			System.out.println("전기요금:" + (fee += (w * 150)) + "원");

		} else if (w >= 201 && w < 301) {
			System.out.println("전기요금:" + (fee += (w * 230)) + "원");

		} else if (w >= 301) {
			System.out.println("전기요금:" + (fee += (w * 300)) + "원");

		} else
			;

	}

}
