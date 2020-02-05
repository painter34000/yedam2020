package com.yedam.hsw.classes;

import java.util.Scanner;

public class Example002 {
	public static void main(String[] args) {

		int a = 0;
		int[] b = new int[100];
		int c = 0;

		System.out.println("숫자 입력");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		for (int i = 0; i < 100; i++) {
			b[i] = num % 2;
			num = num / 2;
			if (num == 1) {
				a = 1;
				c = i;
				break;
			}
		}
		System.out.print(a);
		for (int i = c; i > 0; i--) {
			System.out.print(b[i]);
		}

	}
}
