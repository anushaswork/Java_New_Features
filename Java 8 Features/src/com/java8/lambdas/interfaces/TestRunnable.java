package com.java8.lambdas.interfaces;

public class TestRunnable {

	public static void main(String[] args) {
		// Runnable run = new RunnableImplementation(); --- using normal implementation class

		// We can use lambdas to skip the implementation class all together

		Runnable run = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Labmda thread");
			}
		};

		Thread thread = new Thread(run);
		thread.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
