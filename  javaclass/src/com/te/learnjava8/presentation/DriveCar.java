package com.te.learnjava8.presentation;

public class DriveCar {
	public static void main(String[] args) {
		Car nexon = new Car("TATA", 1000000, "Orange");
		System.out.println(nexon);

		nexon.installMP();
		System.out.println(nexon);

		Car c2 = new Car();
	}

}
