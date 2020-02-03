//package com.yedam.hsw.classes.extendPkg;
//
//public class CarExample {
//	public static void main(String[] args) {
//
//		Car car = new Car();
//		for (int i = 0; i <30; i++) {
//			int problemPosition = car.run();
//			switch (problemPosition) {
//			case 1:
//				System.out.println("앞 왼쪽 한국타이어 교체");
//				car.frontLeft = new HankookTire("앞 왼쪽", 20);
//				break;
//			case 2:
//				System.out.println("앞 오른쪽 금호타이어 교체");
//				car.frontRight = new KumhoTire("앞 오른쪽", 22);
//				break;
//			case 3:
//				System.out.println("뒤 왼쪽 타이어 교체");
//				car.backtLeft = new HankookTire("뒤 왼쪽", 19);
//				break;
//			case 4:
//				System.out.println("뒤 오른쪽 금호타이어 교체");
//				car.backRight = new KumhoTire("뒤 오른쪽", 21);
//				break;
//				package com.yedam.yje.classes.extendPkg;
//
//				public class CarExample {
//				   public static void main(String[] args) {
//				      Car car = new Car(); // 인스턴스
//				      for (int i = 0; i <= 5; i++) {
//				         int problemPosition = car.run();
//				         switch (problemPosition) {
//				         case 1:
//				            System.out.println("앞왼쪽 한국타"
//				                  + "이어 교체.");
//				            car.tires[0] = new HankookTire("앞왼쪽", 20);
//				            break;
//
//				         case 2:
//				            System.out.println("앞오른쪽 금호타이어 교체.");
//				            car.tires[1] = new KumhoTire("앞오른쪽", 22);
//				            break;
//
//				         case 3:
//				            System.out.println("뒤왼쪽 한국타이어 교체.");
//				            car.tires[2] = new HankookTire("뒤왼쪽", 20);
//				            break;
//				         case 4:
//				            System.out.println("뒤오른쪽 금호타이어 교체.");
//				            car.tires[3] = new KumhoTire("뒤오른쪽", 22);
//				            break;
//				         }
//				         System.out.println("--------------------");
//				      } // end of for
//				      System.out.println("주행 종료.");
//				   }// end of main
//				}// end of class
//			}System.out.println("-------------------");
//		
//
//		}System.out.println("주행종료");
//
//	}
//
//}
package com.yedam.hsw.classes.extendPkg;

public class CarExample {
   public static void main(String[] args) {
      Car car = new Car(); // 인스턴스
      for (int i = 0; i <= 5; i++) {
         int problemPosition = car.run();
         switch (problemPosition) {
         case 1:
            System.out.println("앞왼쪽 한국타"
                  + "이어 교체.");
            car.tires[0] = new HankookTire("앞왼쪽", 20);
            break;

         case 2:
            System.out.println("앞오른쪽 금호타이어 교체.");
            car.tires[1] = new KumhoTire("앞오른쪽", 22);
            break;

         case 3:
            System.out.println("뒤왼쪽 한국타이어 교체.");
            car.tires[2] = new HankookTire("뒤왼쪽", 20);
            break;
         case 4:
            System.out.println("뒤오른쪽 금호타이어 교체.");
            car.tires[3] = new KumhoTire("뒤오른쪽", 22);
            break;
         }
         System.out.println("--------------------");
      } // end of for
      System.out.println("주행 종료.");
   }// end of main
}// end of class