package com.yedam.hsw.referenceType;

public class CalculatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		sum(num1, num2);
		minus(num1, num2);
		multi(num1, num2);
		divide(num1, 77);
		print(3);
		printStar(7, "**");
		sum(1, 2);
		int r = sum2(1, 2);
		System.out.println("r의 값은:"+r);
//		System.ret.welcome("규림아~");
		System.out.println(welcome("규림아~"));
		
		
	}

	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("두수의 합은:" + result);

	}

	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println("두수의 차이는:" + result);

	}

	public static void multi(int x1, int y1) {
		int result = x1 * y1;
		System.out.println("두수의 곱하기는:" + result);
	}

	public static void divide(double x2, double y2) {
		double result = x2 / y2;
		System.out.println("두수의 나누기는:" + result);

	}

	public static void print(int w) {
		for (int i = 0; i < w; i++)
			System.out.println(w);

	}

	public static void printStar(int k, String k1) {
		for (int i = 0; i < k; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(k1);
			System.out.println();
		}

	}
	public static int sum2(int a, int b) {
		int result;
		result = a+b;
		return result;
		
		
	}
	public static String welcome(String name) {
		return "Hello  " + name;
		
	}
	
}
