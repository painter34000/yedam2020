package com.yedam.hsw.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("하준원", 20);
		map.put("규림띠", 30);
		map.put("재언띠", 40);
		map.put("다혜찡", 50);
		System.out.println(map.size());
		Integer i= map.get("하준원");
		Set<String> set=map.keySet();
		Iterator<String> iter=set.iterator();
		
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println(key+", "+map.get(key));
		}
	}

}
