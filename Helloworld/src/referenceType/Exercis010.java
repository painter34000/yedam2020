package referenceType;

public class Exercis010 {
	public static void main(String[] args) {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				cnt++;
			}
		avg =sum / cnt;
		System.out.println("sum:" + sum);
		System.out.println("avg:" + avg);
	}
}

//		System.out.println("array 크기:" + array.length);
//		System.out.println("array[0] 크기:" + array[0].length);
//		System.out.println("array[1] 크기:" + array[1].length);
//		System.out.println("array[2] 크기:" + array[2].length);
//
//		min();
//		man();
//	}
//
//	public static void min() {
//		int max = 0;
//		int[] array = { 1, 5, 3, 8, 2 };
//
//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) {
//				max = array[i];
//			}
//		}
//		System.out.println("최대값:" + max);
//	}
//
//	
//
//}
