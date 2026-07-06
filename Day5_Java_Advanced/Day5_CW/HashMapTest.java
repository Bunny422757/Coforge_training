package com.coforge.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Java");
		map.put(2, "Python");
		map.put(20, "Angular");
		map.put(4, "React");
		System.out.println(map);

		map.put(25, "Spring boot");
		System.out.println(map);

		map.remove(20);
		System.out.println(map);

		System.out.println(map.get(10));

		for (int x : map.keySet()) {
			System.out.println(x);
		}

		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
