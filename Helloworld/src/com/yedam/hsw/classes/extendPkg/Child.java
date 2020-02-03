package com.yedam.hsw.classes.extendPkg;

public class Child extends Parent {
	String field2;

	void method2() {
		System.out.println("자식클래스의 메소드2");
	}

	@Override
	public String toString() {
		return "Child [field2=" + field2 + "]";
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}

}
 