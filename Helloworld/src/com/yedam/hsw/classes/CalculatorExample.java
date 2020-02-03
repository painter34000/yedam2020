package com.yedam.hsw.classes;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		while (true) {
			Scanner scn = new Scanner(System.in);

			System.out.println("사칙연산 부호 : +,-,*,/ q:종료");
			String operator = scn.nextLine();

			if (operator.equals("q")) {

				System.out.println("종료");
				break;
			}

			System.out.println("첫번째 수 입력; ");
			int num1 = scn.nextInt();

			System.out.println("두번째 수 입력; ");
			int num2 = scn.nextInt();

			cal(num1, num2, operator);

		}

	}

}
