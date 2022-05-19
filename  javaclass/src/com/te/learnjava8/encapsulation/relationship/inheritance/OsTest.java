package com.te.learnjava8.encapsulation.relationship.inheritance;
/**
 * Generalization 
 * +
 * Specialization
 * Inheriting AndroidOS class and overriding some methods in it
 * @author Utk
 *
 */
public class OsTest {
	public static void main(String[] args) {
		MiuiOS m1 = new MiuiOS();
		ColorOS c1 = new ColorOS();
		OxygenOS o1 = new OxygenOS();
		
		m1.playBootLogo();
		c1.performanceTest();
		o1.playBootSound();
	}

}
