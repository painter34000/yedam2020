package com.yedam.hsw.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
	int stdNo;
	String name;

	public Student(int stdNo, String name) {
		super();
		this.stdNo = stdNo;
		this.name = name;

	}

	@Override
	public int hashCode() {
		return this.stdNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return super.equals(obj);
	}
}

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(111, "다혜찡"), 30);
		map.put(new Student(111, "아라짱"), 40);
		map.put(new Student(111, "지원상"), 50);
		map.put(new Student(111, "다혜징"), 60);
		System.out.println(map.size());

		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			Student key = iter.next();
			System.out.println(key.name + ", " + key.stdNo + map.get(key));
		}
	}

}
