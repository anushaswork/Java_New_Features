package com.java8.lambdas.interfaces;

public class RunnableImplementation implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child implemented thread");
		}
	}

}
