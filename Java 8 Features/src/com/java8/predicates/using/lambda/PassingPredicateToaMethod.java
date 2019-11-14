package com.java8.predicates.using.lambda;

import java.util.function.Predicate;

public class PassingPredicateToaMethod {

	public static void main(String[] args) {

		int[] num = { 0, 7, 10, 50, 60, 70, 80, 81 , 5 , 100};

		Predicate<Integer> p1 = i -> i < 10;
		
		method1(p1, num);

	}

	public static void method1(Predicate<Integer> p, int[] x) {

		for (int e : x) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}

	}

}
