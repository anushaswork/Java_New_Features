package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbersInaList {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			li.add(i);
		}

		System.out.println(li);

		// With ForEach
		/*
		 * List<Integer> liEven = new ArrayList<>();
		 * 
		 * for (Integer in : li) { if (in % 2 == 0) { liEven.add(in); } }
		 */

		// With STREAMS
		List<Integer> liEven = li.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(liEven);

		long count = li.stream().filter(i -> i % 2 == 0).count();

		System.out.println("Count of even numbers:  "+count);

		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);

		List<Integer> liSorted = li.stream().sorted().collect(Collectors.toList());

		System.out.println("Sorted List: "+liSorted);

		int max = li.stream().max(comp).get();

		System.out.println("Max value in the list "+max);

		int min = li.stream().min(comp).get();

		System.out.println("Min value in the list "+min);

	}

}
