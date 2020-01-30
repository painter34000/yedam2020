package referenceType;

//1. 1차원 배열-> 10개 크기
//2. 2차원 배열 -> [5][5]
public class ForWhileExample01 {
	public static void main(String[] args) {

		method1();
		method2();

	}

	public static void method1() {

		int[] intAry = new int[10];
		{
			for (int i = 0; i < 10; i++) {
				intAry[i] = i + 1;
				System.out.println(intAry[i] + "   ");
			}
		}

	}

	public static void method2() {

		int[][] intAry2 = new int[5][5];
		int count = 0;
		{
			for (int i = 0; i < intAry2.length; i++) {
				for (int j = 0; j < intAry2[i].length; j++) {
					intAry2[i][j] = count++;
					System.out.print(intAry2[i][j] + "  ");
				}
				System.out.println();
			}
		}

	}
}
