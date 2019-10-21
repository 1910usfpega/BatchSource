package com.example.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<>();
		
		hMap.put(1,"Andy");
		hMap.put(2,"A");
		hMap.put(3,"B");
		hMap.put(4,"C");
		hMap.put(5,"D");
		
		for (Entry<Integer, String> en : hMap.entrySet()) {
			System.out.println(en.getKey() + "\t" + en.getValue());
		}

	}

}
