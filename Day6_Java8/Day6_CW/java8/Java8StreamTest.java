package com.coforge.day6.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(11, 12, 13, 14, 15);

		// stream is initial operation,filter is intermediate operation,collect is
		// termination function
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		long c = list.stream().filter(n -> n % 2 == 0).count();
		System.out.println(c);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);

		List<String> names = Arrays.asList("Pranaav", "Srakshin", "Suresh");
//		names.stream().filter(n -> n.contains("a")).map(n -> n.length()).forEach(System.out::println);
//		
//		//map
		
		Map<Integer,String> map = names.stream().collect(Collectors.toMap(x -> x.length(), x -> x));
		System.out.println(map);

	}

}
