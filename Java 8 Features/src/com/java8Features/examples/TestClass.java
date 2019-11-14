package com.java8Features.examples;

public class TestClass {

	public static void main(String[] args) {

		FunctionalInterfaceClass obj = () -> System.out.println("Lambda Blah");

		obj.method();

	}

}
