
public class ForWhileExample {

//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 100; i++) {
//			if (i % 3 == 0 || i % 7 == 0 ||i % 5 ==0 )
//				System.out.println("100 미만의 3과 7의 배수 :" + i);
//
//		}
//
//	}
//
//}

	public static void main(String[] args) {
		int i = 0;
		while (i <= 100) {
			if (i % 3 == 0 && i % 7 == 0)
				System.out.println(i);
			i++;
		}
	}
}
