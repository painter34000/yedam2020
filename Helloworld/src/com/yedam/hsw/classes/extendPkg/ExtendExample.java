package com.yedam.hsw.classes.extendPkg;

import java.util.Scanner;

public class ExtendExample {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		p1.field1 = "aaa";
		p1.method1();

		Child c1 = new Child();
		c1.field1 = "aaa";
		c1.field2 = "bbb";
		c1.method1();
		c1.method2();
	}

	}

