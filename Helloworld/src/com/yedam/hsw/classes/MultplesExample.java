package com.yedam.hsw.classes;

import java.util.Scanner;

public class MultplesExample {
	public static void main(String[] args) {
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("숫자 입력 | 999  = 종료");
			{
				int num = scn.nextInt();

				if (num == 999) {
					System.out.println("종료");
					break;
				} else if (num % 18 == 0) {
					System.out.println("2의 배수 9의 배수");
				} else if (num % 16 == 0) {
					System.out.println("2의 배수 8의 배수");
				} else if (num % 14 == 0) {
					System.out.println("2의 배수 7의 배수수");
				} else if (num % 12 == 0) {
					System.out.println("2의 배수 6의 배수수");
				} else if (num % 10 == 0) {
					System.out.println("2의 배수 5의 배수수");
				} else if (num % 8 == 0) {
					System.out.println("2의 배수 4 배수수");
				} else if (num % 6 == 0) {
					System.out.println("2의 배수 3의 배수수");

				} else if (num % 7 == 0) {
					System.out.println("5의 배수");
				} else if (num % 5 == 0) {
					System.out.println("5의 배수");
				} else if (num % 3 == 0) {
					System.out.println("3의 배수");
				} else if (num % 2 == 0) {
					System.out.println("2 배수");

				} else {
					System.out.println("기타");
				}

			}
		}
	}
}
