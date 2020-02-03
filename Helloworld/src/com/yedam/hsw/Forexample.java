package com.yedam.hsw;

public class Forexample {
	public static void main(String[] args) {

		char var1 = 64;
		for (int i = 0; i < 26; i++) {
			var1 = (char) (var1 + 1);

			System.out.println("알파벳 출력" + var1);

		}

		boolean trueOrFalse = false;
		if (3 != 5) {
			System.out.println("참입니다");

		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
				System.out.println("i : " + i +"  sum :" + sum);
			}
		}
		System.out.println("1~100중 짝수만 더한값 : " + sum);

		
		
		
		int varl1, varl2 = 3;
			for (int i = 1; i <= 9; i++) {
				varl1 = varl2 * i;
			
			System.out.println(varl2 + " * " + i + " = " + varl1);
			}
	}

}


