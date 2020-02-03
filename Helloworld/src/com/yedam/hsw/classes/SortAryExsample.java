package com.yedam.hsw.classes;

public class SortAryExsample {

	public static void main(String[] args) {

		int[] ary = { 15, 13, 20, 25, 7, 17 };
		int sort = 0;

		for (int j = 0; j < ary.length-1; j++) {
			for (int i = 0; i < ary.length-1; i++) {
				if (ary[i] > ary[i+1]) {
					sort = ary[i];
					ary[i] = ary[i+1];
					ary[i+1] = sort;
				}
			}
		}
		for (int a = 0; a < ary.length; a++) {
			System.out.println(ary[a]);

		}
	}
}