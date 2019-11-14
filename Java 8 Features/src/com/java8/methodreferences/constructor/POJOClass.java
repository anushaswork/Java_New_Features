package com.java8.methodreferences.constructor;

public class POJOClass {

	String s;
	
	POJOClass(String s) {
		this.s = s;
		System.out.println("The String Value inside constructor is : "+s);
	}
}
