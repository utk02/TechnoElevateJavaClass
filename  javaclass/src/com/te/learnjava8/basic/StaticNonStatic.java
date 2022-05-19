package com.te.learnjava8.basic;

public class StaticNonStatic {
	int a = 10; // Non static single line initializer
	int b;
	{
		// Non static multiline initializer
		b = 20;
		int c = 30;
		System.out.println("Non static multiline initializer executed");
	}
	static int d = 10; // Static single line initializer
	static int e;
	static {
		// Static multiline initializer
		e = 20;
		int f = 30;
		System.out.println("Static multiline initializer executed");
	}

	public void m1() {
		System.out.println("Non static method called");
	}

	public static void m2() {
		System.out.println("Static method called");
	}

	public StaticNonStatic() {
		System.out.println("StaticNonStatic() constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main(...) method called");

		StaticNonStatic s1 = new StaticNonStatic();
	}

}
