package com.java8.methodreferences;

public class MethodReferencesInstance {

	public void runMethod() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Method");
		}

	}

	public static void main(String[] args) {

		MethodReferencesInstance obj = new MethodReferencesInstance();

		Runnable r = obj::runMethod;

		Thread t = new Thread(r);
		t.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Parent Method");
		}

	}

}
