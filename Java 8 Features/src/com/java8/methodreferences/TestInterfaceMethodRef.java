package com.java8.methodreferences;

public class TestInterfaceMethodRef {

	public void refMethod(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {

		InterfaceMethodRef in = i -> System.out.println(i);
		in.myMethod(10);

		TestInterfaceMethodRef obj = new TestInterfaceMethodRef();
		InterfaceMethodRef r = obj::refMethod;
		r.myMethod(20);

	}

}
