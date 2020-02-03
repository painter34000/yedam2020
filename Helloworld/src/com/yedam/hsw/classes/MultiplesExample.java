package com.yedam.hsw.classes;

import java.util.Scanner;

//2, 3배수 이외의 경우는 기타
// 종료 999입력
public class MultiplesExample {

	public static void main(String[] args) {

		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("숫자 입력 | 999 = 종료");
			{
				int num = scn.nextInt();

				if (num == 999) {
					System.out.println("종료");
					break;
				} else if (num % 6 == 0) {
					System.out.println("2의 배수 3의 배수");
				} else if (num % 2 == 0) {
					System.out.println("2의 배수");
				} else if (num % 3 == 0) {
					System.out.println("3의 배수");
				} else {
					System.out.println("기타");
				}

			}
		}
	}
}
