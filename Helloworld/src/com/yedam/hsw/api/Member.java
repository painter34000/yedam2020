package com.yedam.hsw.api;

public class Member {

	String name;
	int age;

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		// return this.name.equals(m.name);
		return this.age == m.age && this.name.equals(m.name);

	}

	@Override
	public int hashCode() {

		return age;
	}

}
