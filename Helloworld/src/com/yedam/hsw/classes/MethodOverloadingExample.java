package com.yedam.hsw.classes;

//메소드 오버로딩:동일한 메소드 사용
public class MethodOverloadingExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println(12);

		int num1 = 10, num2 = 20;
		double d1 = 1.5, d2 = 2.3;
		print(sum(d1, d2)); // double받아서 실행할수 있도록 메소드가 정의
		print(sum(num1, num2));// int받아서 실행할수 있도록 메소드가 정의

	}

	static void print() {
		System.out.println();
	}

	static void print(double str) {
		System.out.println(str);
	}

	static void print(String str) {
		System.out.println(str);
	}

	static void print(int str) {
		System.out.println(str);
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int sum(int c, int d, int a) {
		return c + d + a;
	}

	static double sum(double a, double b) {
		return (double) (a+b);

	}
}