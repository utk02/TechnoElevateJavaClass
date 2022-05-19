package com.te.learnjava8.presentation;

public class Car {
	private String carBrand;
	private double carPrice;
	private String color;
	// Early instantiation
	Engine e1 = new Engine("TATA", 140, "Petrol");
	// Late instantiation
	MusicPlayer m1;

	public Car() {
		super();
	}

	public Car(String carBrand, double carPrice, String color) {
		super();
		this.carBrand = carBrand;
		this.carPrice = carPrice;
		this.color = color;
	}

	// Late instantiation
	public void installMP() {
		m1 = new MusicPlayer("Sony", 15000);

	}

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", carPrice=" + carPrice + ", color=" + color + ", e1=" + e1 + ", m1=" + m1
				+ "]";
	}

}
