package com.java8.lambda.withParams;

public class TestAdd  {

	public static void main(String[] args) {

		Sum sum = (x,y) -> System.out.println("sum = "+(x+y));
		
		sum.add(10,50);
		
	}

}
