package com.yedam.hsw.referenceType;

public class Exercis009 {
	public static void main(String[] args) {
		int[] intAry = { 8, 7, 15, 9, 3 };
		int max = 0;

		for (int i = 0; i < intAry.length; i++) {
			if (max < intAry[i]) {
				max = intAry[i];

			}
		}
		System.out.println("최대값은:" + getMaxValue(intAry));
	}

	public static int getMaxValue(int[] ary) {
		int max = 0;

		for (int i = 0; i < intAry.length; i++) {
			if (max < ary[i]) {
				max = ary[i];
			}
		}
	}
}
