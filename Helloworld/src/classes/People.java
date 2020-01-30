package classes;

public class People {

// 필드
	String name;

	int age;
	int height;
	int weight;
	int phone;
	int face;
	int fsize;

// 생성자
	People() {

	}

	People(String name, int age, 
				int height, int weight, 
				int phone, int face, int fsize){
		
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.phone=phone;
		this.face=face;
		this.fsize=fsize;
	}

// 메소드
	void bkball() {
		System.out.println("농구를 한다");

	}

	void cart() {
		System.out.println("주차위" + "반 딱지를 떼다");
	}

	void food() {
		System.out.println("점심을 고민하다");
	}

}
