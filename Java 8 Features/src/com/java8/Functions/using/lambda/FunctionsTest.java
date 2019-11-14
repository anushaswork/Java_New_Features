package com.java8.Functions.using.lambda;

import java.util.function.Function;

public class FunctionsTest {
	
	public static void main(String[] args) {
		
		Function<String, Integer> fun = i -> i.length();
		System.out.println(fun.apply("Blah"));
		System.out.println(fun.apply("Java8Functions"));
		
	}

}
