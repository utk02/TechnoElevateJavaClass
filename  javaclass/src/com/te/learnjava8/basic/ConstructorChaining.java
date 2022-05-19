package com.te.learnjava8.basic;

public class ConstructorChaining {
	public ConstructorChaining() {
		System.out.println("From ConstructorChaining() constructor ");
	}

	public ConstructorChaining(int a) {
		this();
		System.out.println("From ConstructorChaining(int a) constructor ");
	}

	public static void main(String[] args) {
		ConstructorChaining c1 = new ConstructorChaining(20);
	}

}
