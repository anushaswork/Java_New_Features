package com.java8.predicates.using.lambda;

import java.util.function.Predicate;

public class GreaterThan20 {
	
	public static void main(String[] args) {
		
		//Without Lambda
		/*Predicate<Integer> p = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t>20)
					return true;
				return false;
			}
		};*/
		
		Predicate<Integer> p = (i)->(i>20);
		
		System.out.println(p.test(30));
		System.out.println(p.test(15));
		System.out.println(p.test(55));
		System.out.println(p.test(80));
		System.out.println(p.test(1));
	}

}
