package com.java8.methodreferences;

public class MethodReferences {

	public static void runMethod() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Method");
		}

	}

	public static void main(String[] args) {
		
		Runnable r = MethodReferences::runMethod;
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Parent Method");
		}

		
	}

}
