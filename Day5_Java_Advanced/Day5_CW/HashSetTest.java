package com.coforge.day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();

		// l1.add(new Integer(10)); Boxing
		set.add(20); // Auto-Boxing
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(35);
		set.add(20);
		System.out.println(set);
		System.out.println(set.remove(30));
		System.out.println(set);
		
		for(int num:set) {
			System.out.println(num);
		}

		System.out.println();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
