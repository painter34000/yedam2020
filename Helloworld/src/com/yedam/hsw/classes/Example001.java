package com.yedam.hsw.classes;

import java.util.Scanner;

public class Example001 {
	public static void main(String[] args) {

//		String result = "";
//		int num2 = 0;
//		int num1 = num;
//		while (true) {
//			num2 = num1 % 2;
//			result = num2 + result;
//			num1 = num1 / 2;
//			if(num1==0)
//				break;
//		}
//		return result;

		int a = 0;
		int[] b = new int[1000];
		int c = 0;

		System.out.println("값을 입력하시오. ");
		Scanner input = new Scanner(System.in); // 문자열입력받고
		int num = input.nextInt();

		for (int i = 0; i < 1000; i++) {
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
//		for (int i = binary.length - 1; i >= 0; i--) {
//		System.out.print(binary[i]);
	}
}
