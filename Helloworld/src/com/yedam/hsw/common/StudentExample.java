package com.yedam.hsw.common;

import com.yedam.hsw.classes.Student;

public class StudentExample {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Student stn = new Student();
		stn.study();
		Student snt = new Student("name");
		snt.eat();

	}

}


// 패키지 이르 설정: 홈페이지 주소를 사용 (거꾸로 해서)
//ex:    www,samsung.com
//   com.samsung.lch
//   com.yedam21.lch 등등