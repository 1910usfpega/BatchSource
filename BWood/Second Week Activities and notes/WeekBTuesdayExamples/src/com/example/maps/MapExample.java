package com.example.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> hMap = new HashMap<>();
		hMap.put(75, "Jack");
		hMap.put(2, "Bob");
		hMap.put(33, "Alex");
		hMap.put(17, "Morty");
		hMap.put(99, "Rick");
		hMap.put(null, "BeardedLady");
		hMap.put(75, "Michael");
		System.out.println(hMap);
		System.out.println(hMap.get(null));
		
		for(Entry<Integer, String> en : hMap.entrySet()) {
			System.out.println(en.getKey() + "\t" + en.getValue());
		}
		
//		for(int i=0; i<something.size(); i++) {
//			//logic
//		}
//		
//		for(Object something : collection) {
//			//logic
//		}
		
	}

}
