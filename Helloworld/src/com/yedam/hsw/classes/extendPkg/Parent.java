package com.yedam.hsw.classes.extendPkg;

public class Parent {

	String field1;
	void method1() {
		System.out.println("부모 클랙스의 메소드1");
	}

	@Override
	public String toString() {
		return "parent [field1=" + field1 + "]";
	}

}
