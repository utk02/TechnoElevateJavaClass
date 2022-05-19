package com.te.learnjava8.encapsulation.relationship.inheritance.upcasting;

/**
 * Upcasting and Method Overriding
 * 
 * @author Utk
 *
 */
public class OsTest {
	public static void main(String[] args) {

		AndroidOS colorOS = new ColorOS(); // Upcasting

		colorOS.performanceTest();
		colorOS.playBootSound();
		/*
		 * The below line will give CTE, because AndroidOS has no knowledge about the
		 * gui() method present in the ColorOS
		 */
		// colorOS.gui();
		
	}

}
