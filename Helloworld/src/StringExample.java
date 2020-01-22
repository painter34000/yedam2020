
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(3 + 5);
		System.out.println(3 + 5 + " 합은 얼마인가?");

		System.out.println("두 수의 합은 " + 8 + "입니다");
		System.out.println(3 + 5 + " 합은 얼마인가?");
		System.out.println("두 수의 합은 " + (3 + 5) + "입니다");

		if (5 % 3 != 0) {
			System.out.println(" 입니다");

			int var1 = 25634572;

			if (var1 % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		}
		System.out.println(3 == 3);
		int var3 = 30, var4 = 20;
		int biggerValue = 0;

		if (var3 <= var4) {
			System.out.println(var3);
		} else {
			biggerValue = var4;
		}
		System.out.println("큰수는 " + biggerValue);
		biggerValue = (var3 >= var4) ? var3 : var4;
		System.out.println("큰수는 " + biggerValue);

	}

}



