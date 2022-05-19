package com.te.learnjava8.encapsulation.relationship.inheritance.upcasting;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

class Aa {
	int a = 10;
}

class Bb extends Aa {
	int b = 20;
}

class Cc extends Bb {
	int c = 30;
}

class D {

}

public class TryInstanceOf {
	public static void main(String[] args) {
		Cc c = new Cc();

		/*
		 * 'instanceof' operator return boolean value, it checks whether the given
		 * object reference is an instance of the class or not. if it is, then returns
		 * 'true' else it returns 'false'
		 */
		/*
		 * 
		 */
		if (c instanceof Bb) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		/*
		 * Or we can directly use 'instancef' operator in print statement
		 */
		System.out.println((new Aa()) instanceof Cc);

	}

}
