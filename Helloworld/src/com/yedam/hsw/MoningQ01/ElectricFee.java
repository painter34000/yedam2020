package com.yedam.hsw.MoningQ01;

import java.util.Scanner;

public class ElectricFee {

	public static void main(String[] args) {
		System.out.println("사용한 전력 입력");
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt(); // 와트수 입력받는 변수
		int fee = 0;

		for (int i = 0; i <= w; i++) {
			if (i <= 100) {
				fee = i * 100;
			} else if (i <= 200) {
				fee = i * 150;
			} else if (i <= 300) {
				fee = i * 230;
			} else if (i > 300) {
				fee = i * 300;
			} else
				;

		}
		System.out.println("요금" + fee);
	}
}
