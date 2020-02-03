package com.yedam.hsw;

public class Ary2Example {

	public static void main(String[] args) {

//		int[] intAry = new int[5];
//
//		for (int i = 0; i < 5; i++) {
//			intAry[i] = i * 10 + 10;
//		}
//		System.out.println("______________");
//		for (int i = 0; i < 5; i++) {
//			System.out.println(intAry[i]);
//		}
//	}
//}

// 		int[] intAry2 = new int[100];
//		int[] intAry3 = new int[100];
// 		
// 		for (int i = 0; i < 100; i++) {
// 			intAry2[i] = (i+1)*5;
// 			System.out.print(intAry2[i]+"  ");
//// 		    for(int f = 0; f < 100; f++) 
//// 			intAry3[f] = (f+1)*4;
//// 			System.out.print());
// 			if (intAry2[i] % 25 == 0) {
// 	            System.out.println();			
// 			}
// 		}

		int[] intAry2 = new int[100];

		int i = 0;
		while (i < 100) {
			System.out.println(intAry2[i] + "");
			if (intAry2[i] % 25 == 0) {
				System.out.println();
			}
			i++;
		}
	}
}
