package com.te.learnjava8.encapsulation.relationship.inheritance.upcasting;

class A {
	{
		System.out.println("From class A");
	}
}

class B extends A {
	{
		System.out.println("From class B");
	}

}

class C extends B {
	{
		System.out.println("From class C");
	}

}

public class ClassCastException {
	public static void main(String[] args) {
		A a = new B();

		/*A <-- B <-- C
		 * 
		 * 
		 * Here we are trying to downcast the object reference of b from type A
		 * (upcasted) to type C, but here object of B does not know what is there
		 */
		C c = (C) a;
	}

}
