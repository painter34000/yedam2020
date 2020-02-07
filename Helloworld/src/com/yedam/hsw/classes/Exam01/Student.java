package com.yedam.hsw.classes.Exam01;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		String name;
		String schoolNumber;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("=========================");
			System.out.println("1.이름2.학변3.영어점수4.수학점수5.종료");
			System.out.println("=========================");
			System.out.println("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("이름:");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("학번[" + i + "]>");
					int score = scanner.nextInt();
					scores[i] = score;

				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("영어점수[" + i + "]>" + scores[i]);

				}

			} else if (selectNo == 4) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("수학점수[" + i + "]>" + scores[i]);

				}

			} else if (selectNo == 5) {

				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
