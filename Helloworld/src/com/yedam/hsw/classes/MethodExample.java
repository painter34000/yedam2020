package com.yedam.hsw.classes;

public class MethodExample {
	public static void main(String[] args) {

		Method m = new Method();
		m.setLeftField(30);
		m.setRightField(4);

		int result = m.thisSum() + m.thisminus();
		int result2 = m.sum(60, 10) * m.minus(30, 25);

		System.out.println("필드의 결과값은:" + result);
		System.out.println("두수의 합:" + result2);

//		int result = m.thisSum() + m.thisminus();
//		int result2 = m.sum(60, 10) * m.minus(30, 25);

		result2 = m.sum(60, 10) * m.minus(30, 25);
		m.setLeftField(50);
		m.setLeftField(100);
		System.out.println("2 필드의 결과:" + result2);

		m = null;
		System.out.println(m.getLeftField());
	}

}
