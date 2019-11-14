package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCasetoLowerCaseMap {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("NEW YORK");
		list.add("SYDNEY");
		list.add("BENGALURU");

		System.out.println(list);

		List<String> lowercaseList = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());

		System.out.println(lowercaseList);
	}

}
