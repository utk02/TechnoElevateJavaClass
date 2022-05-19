package com.te.learnjava8.encapsulation.relationship.inheritance.downcasting;

public class ColorOS extends AndroidOS {
	
	@Override
	public void performanceTest() {
		System.out.println("Performance of OS is increased in Color OS");
	}
	
	public void playBootSound() {
		System.out.println("Boot Sound of Color Os is playing");
	}
	public void gui() {
		System.out.println("GUI of Color OS ");
	}

}
