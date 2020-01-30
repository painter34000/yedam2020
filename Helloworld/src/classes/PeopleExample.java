package classes;

public class PeopleExample {

	public static void main(String[] args) {

		People pp = new People();
//필드
		pp.name = "park";
		pp.age = 29;
		pp.height = 200;
		pp.weight = 88;

// 출력
		System.out.println(pp.name);
		System.out.println(pp.age);

		pp.bkball(); // 메소드 안에 출력값이 있어서 따로 출력입력이 필요 없음
		pp.cart();
		pp.food();

		People oo = new People();
		
		
		People oo = new People("choi", 20, 180, 70,34,34,2);
		
		System.out.println(oo.name);
	
		System.out.println(oo.age);
	}

}
