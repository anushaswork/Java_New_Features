package com.java8.predicates.using.lambda;

import java.util.function.Predicate;

public class StringPredicate {
	
	public static void main(String[] args) {
		
		Predicate<String> pre = (i) -> (i.length() > 5);
		
		System.out.println(pre.test("Blah"));
		
		
	}

}
