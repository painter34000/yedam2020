package com.yedam.hsw.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList=new ArrayList<>(); //list가 부모고 arraylist가 자식 클래스라고 할수 있음.
		strList.add("하준원");
		strList.add("박규림");//strAry[0]="hello"
		strList.add("홍성우");
		System.out.println(strList.get(0));

		
		strList.add(2,"이배진");
		System.out.println(strList.get(1));
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		strList.remove(3);
		System.out.println("remove(3) 이후.");
		for(String str: strList) {
			System.out.println(str);
		}
		
		List<Integer> intList=new LinkedList<>();
	}
	
	
	}
}
