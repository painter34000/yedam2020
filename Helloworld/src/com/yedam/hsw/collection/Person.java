package com.yedam.hsw.collection;

public class Person implements Comparable<Person> {
	   String name;
	   int age;

	   public Person(String name, int age) {
	      super();
	      this.name = name;
	      this.age = age;
	   }

	   @Override
	   public int compareTo(Person o) { //비교해줌. 
	      return  o.name.length() -this.name.length ();
	   }
	}