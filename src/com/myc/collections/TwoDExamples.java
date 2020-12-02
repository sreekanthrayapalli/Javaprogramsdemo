package com.myc.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoDExamples {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "pqr");
		Integer io = null;
		map.put(1, "abc2");
		map.put(null, "aldf");
		map.put(null, "aldf2");
		System.out.println(map);
		System.out.println(map.containsKey(2));
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		
		Set<Map.Entry<Integer, String>> sets = map.entrySet();
		
		for(Map.Entry<Integer, String> me : sets) {
			System.out.println(me.getKey()+" -->  "+me.getValue());
		}
	}

}
