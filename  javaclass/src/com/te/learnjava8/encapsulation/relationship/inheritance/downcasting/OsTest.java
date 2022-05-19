package com.te.learnjava8.encapsulation.relationship.inheritance.downcasting;

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

		// Downcasting
		ColorOS colorOS2 = (ColorOS) colorOS;
		colorOS2.gui();

		/*
		 * Or we can do like as following 
		 * Here Android type reference is downcasted to
		 * ColorOS type and then we are directly using that
		 */
		// Downcasting
		((ColorOS) colorOS2).gui();

	}

}
