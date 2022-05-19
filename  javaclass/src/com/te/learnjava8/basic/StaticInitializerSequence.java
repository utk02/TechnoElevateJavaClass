package com.te.learnjava8.basic;

public class StaticInitializerSequence {
	static {
		System.out.println("Static multiline initializer executed");
		System.out.println("Using static variable a in initializer: " + StaticInitializerSequence.a);
	}
	static int a = 10;
	{
		System.out.println("Non static multiline initializer executed");
		System.out.println("Using non static variable b in initializer: " + this.b);
	}
	int b = 20;

	public StaticInitializerSequence() {
		// 1. Non-static members of the class gets loaded inside the object
		// 2. Non-static initializers will get executed from top to bottom order
		// 3. Programmer written instructions will be executed
		System.out.println("StaticInitializerSequence() constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main(...) method called");
		System.out.println("Using static variable a in main(...) method " + StaticInitializerSequence.a);

		StaticInitializerSequence initializerSequence = new StaticInitializerSequence();
		System.out.println("Using static variable b in main(...) method " + initializerSequence.b);

	}
}
