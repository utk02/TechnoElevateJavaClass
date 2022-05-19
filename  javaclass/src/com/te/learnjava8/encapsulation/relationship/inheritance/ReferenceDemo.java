package com.te.learnjava8.encapsulation.relationship.inheritance;

public class ReferenceDemo {
	public static void main(String[] args) {
		SomeClass someClass = new SomeClass();
		someClass.setA(10);
		
		SomeClass someClass1 = someClass;
		someClass1.setA(20);
		
		SomeClass someClass2 = someClass1;
		someClass2.setA(30);

		System.out.println(someClass.a);
	}
}
