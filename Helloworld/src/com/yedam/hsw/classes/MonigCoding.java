package com.yedam.hsw.classes;

public class MonigCoding {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // 1~5 반복  생성
			for (int j = 5; j > 0; j--) {//  5에서 부터 줄어들며 반복 수행
				if (i < j) { // j가 i보다 크면 공백 출력
					System.out.print(" ");
				} else  { // i가 j보다 크면 * 출력
					System.out.print("*");
					// 줄바꿈
				}
				
			}System.out.println(); //출력  (범위설정 주)
		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (i + j >= 4) {
//					System.out.print("*");
//				} else {
//					System.out.print("-");
//
//				}
//
//			}
//			System.out.println();
//		}

	}
}
