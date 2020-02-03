package com.yedam.hsw.classes;

public class Student {
// 필드(속성)
	private String name;

	private int age;
	private int height;
	private int weight;
	

//생성자(인스턴스를 만들면서 필드값을 초기화할때 사용)  Student()에서 '()'표시는 초기값을 표시
	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}

	
	
	
	Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

// 메소드(동작)
	public void study() {
		System.out.println("공부한다");

	}

	public void eat() {
		System.out.println("밥을 먹는다");
	}

	public void sleep() {
		System.out.println("잠을 잔다");
	}

//age필드를 반환해준다.  age가 int이므로 int타입으로 메서드 지정해준다.

	void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else
			this.age = 0;

	}

	int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
