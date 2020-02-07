package com.yedam.hsw.classes.Exam01;

public class Exam04 {
	public static void main(String[] args) {

		int num = 1, sum = 0;

		while (num <= 100) {
			if (num % 2 == 0 || num % 3 == 0) // 2의배수이면서3의배수
			{
				System.out.println(num);
				sum = sum + num;
			}
			num++;
		}
		System.out.println(" 합 : " + sum);
	}

}
