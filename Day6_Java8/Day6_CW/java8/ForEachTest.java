package com.coforge.day6.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> res = Arrays.asList(1, 2, 3, 4, 5);
		res.forEach(n -> System.out.println(n));
		System.out.println();
		
		res.forEach(n -> {
			if(n%2 == 0) {
				System.out.println(n);
			}
		});
		

	}

}
