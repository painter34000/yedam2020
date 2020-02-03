package com.yedam.hsw;

public class ArrayExample {

//	public static void main(String[] args) {
//		
//		int[] intAry = {2,3,4,5};
//		System.out.println(intAry[0]);
//		System.out.println(intAry[1]);
//		System.out.println(intAry[2]);
//		System.out.println(intAry[3]);
//
//		System.out.println("================");
//		intAry[0] = 20;
//		intAry[1] = 30;
//		
//		for(int i =0; i<4; i++) {
//			System.out.println(intAry[i]);
//		}
//		
//	
//	}
	
	public static void main(String[] args) {
		
		int[] intAry = {1,2,3,4,5};
		for(int i =0; i<=4; i++) {
			intAry[i] = i * 10 +10;
			System.out.println(intAry[i]);

		}
		System.out.println("============");	
		
		int sum = 0;
		for (int f = 0; f <= 3; f++ )
			sum = intAry[f] + sum;
		{	
			System.out.println("합계 :" +sum);
		}
	//  sum = sum + intAry[i];
	//  sum += intAry[i];
		// 다 같은 내용. 아래는   곱하기 표시, 나누기 표시는  '/=' 로 표시
		// sum *= intAry[i];
	}
}

