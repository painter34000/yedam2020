package com.yedam.hsw.generic.before1;

import java.util.ArrayList;
import java.util.List;

import com.yedam.hsw.classes.interfaces.model.Employees;

public class BoxExample {
	public static void main(String[] args) {

		Box box = new Box();
		box.set("Hello");
		String str = (String) box.get();

		Apple apple = new Apple();
		
		box.set(apple);
		Apple apple2 = (Apple) box.get();
		String str2 = (String) box.get();
		
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("World");
		for(String str:list) {
			System.out.println(str);
		}
		
		List<Employees> empList=null;
		
		List<Apple> appleList=new ArrayList<>();
		appleList.add(new Apple());
		
		List ist=new ArrayList();
		ist.add(new Apple());
		ist.add("hello");
		for(Object obj:ist) {
			System.out.println(obj);
			
		}
		}

}
