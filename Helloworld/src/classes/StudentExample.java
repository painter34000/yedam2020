package classes;

public class StudentExample {

	public static void main(String[] args) {

//선언
		Student stnt = new Student();
// stnt를 선언하고   new Student를 stnt에 담았다
// new라는 키워드는 Student를 선언하는 것이다.

		Student sn = new Student("choi", 20, 180, 70);
		System.out.println(sn.name);
		System.out.println(sn.age);
		System.out.println(sn.height);

		stnt.name = "hong";
		stnt.age = 20;
		stnt.height = 170;
		stnt.weight = 65;

		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);

		stnt.study();
		stnt.eat();
		stnt.getAge();
		System.out.println(stnt.getAge());

//선언
		Student snt = new Student();

		snt.name = "ha";
		snt.age = 20;
		snt.height = 170;
		snt.weight = 65;

		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);

	}

}
