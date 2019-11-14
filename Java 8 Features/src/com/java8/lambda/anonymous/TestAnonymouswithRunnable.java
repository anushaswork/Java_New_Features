package com.java8.lambda.anonymous;

public class TestAnonymouswithRunnable {

	public static void main(String[] args) {

		// Normal using Runnable method

		/*
		 * Thread th = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for (int i = 1; i < 10; i++) {
		 * System.out.println("Child Anonymous Thread"); }
		 * 
		 * } });
		 */

		// using lambda

		Thread th = new Thread(() -> {
			for (int i = 1; i < 10; i++) {
				System.out.println("Child Anonymous lambda Thread");
			}
		});

		th.start();

		for (int i = 1; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
