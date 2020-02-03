package com.yedam.hsw;

public class VariableType {
	public static void main(String[] args) {

		byte var1, var2;
		int sum;

		var1 = 55;
		var2 = 33;
		sum = var1 + var2;

		System.out.println(sum);

		char chr1 = 65 + 1;
		for (int i = 0; i < 10; i++) {
			chr1 = (char) (chr1 + 1);
			System.out.println(chr1);
		}

	}
}
