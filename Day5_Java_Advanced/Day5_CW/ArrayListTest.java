package com.coforge.day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();

		// l1.add(new Integer(10)); Boxing
		l1.add(20); // Auto-Boxing
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(35);
		l1.add(20);
		System.out.println(l1);
		System.out.println(l1.get(0)); // Indexed based collection
		System.out.println(l1.remove(3));
		System.out.println(l1);
		System.out.println(l1.set(1, 90)); // Updating
		System.out.println(l1);

//		for (int i = 0; i < l1.size(); i++) {
//			System.out.println(l1.get(i));
//		}

		Iterator<Integer> it = l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
