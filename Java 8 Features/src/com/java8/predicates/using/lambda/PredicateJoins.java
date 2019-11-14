package com.java8.predicates.using.lambda;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {

		int[] num = { 0, 7, 10, 50, 60, 70, 80, 81, 5, 100 };

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Greater than 10 :");
		method1(p1, num);
		System.out.println("Even Numbers :");
		method1(p2, num);
		System.out.println("Negate so less than 10 :");
		method1(p1.negate(), num);
		System.out.println("And operation");
		method1(p1.and(p2), num);
		System.out.println("OR Operation");
		method1(p1.or(p2), num);
	}

	public static void method1(Predicate<Integer> p, int[] x) {

		for (int e : x) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}

	}

}
