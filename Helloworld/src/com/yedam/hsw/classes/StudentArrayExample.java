package com.yedam.hsw.classes;

public class StudentArrayExample {

	public static void main(String[] args) {

		int[] intAry = { 1, 2, 3 };

		Student[] stdAry = new Student[3];

		// 선언
		Student stnt = new Student();
		// stnt를 선언하고 new Student를 stnt에 담았다
		// new라는 키워드는 Student를 선언하는 것이다.
		stnt.setName("hong");
//		stnt.age = 20;
		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(65);

		// 선언
		Student snt = new Student();

		snt.setName("park");
//		snt.age = 25;
		snt.setAge(25);
		snt.setHeight(180);
		snt.setWeight(76);

		Student sn = new Student("choi", 20, 180, 70);

		stdAry[0] = sn;
		stdAry[1] = snt;
		stdAry[2] = stnt;

		stdAry[0]=stdAry[1];
		stdAry[1]=stdAry[2];
		stdAry[2]=stdAry[0];
		
		
		
		
		
		for (int i = 0; i < stdAry.length; i++)
//			if (stdAry[i].name.equals("choi")) 

			System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());

	}
	

	}
	
}
