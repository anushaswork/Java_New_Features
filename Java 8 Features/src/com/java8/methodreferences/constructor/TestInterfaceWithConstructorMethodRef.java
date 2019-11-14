package com.java8.methodreferences.constructor;

public class TestInterfaceWithConstructorMethodRef {
	
	public static void main(String[] args) {
		
		MethodInterface m = s -> new POJOClass(s);
		m.myMethod("Using Lambdas");
		
		MethodInterface m1 = POJOClass::new;
		m1.myMethod("Using MethodReference");
		
	}

}
