package com.yedam.hsw;

public class IntAryExample {

	public static void main(String[] args) {

		int[] intAry = new int[100];

		for (int i = 0; i <= 99; i++) {
			intAry[i] = i+1;
			System.out.println(intAry[i]);
		}
		System.out.println("==========");

		int sum = 0;
		for (int i = 0; i <= 99; i++) {
			if (i % 2 == 1) 
				sum += intAry[i];			
		}
		System.out.println(sum);
	}
}
//
//int[] intAry = {1,2,3,4,5};
//for(int i =0; i<=4; i++) {
//	intAry[i] = i * 10 +10;
//	System.out.println(intAry[i]);

//배열크기가 100인 배열 intAry
//배열의 홀수번째 위치에 있는 값을 합하는 for 구문