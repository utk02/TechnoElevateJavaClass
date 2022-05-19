package com.te.learnjava8.presentation;

public class Engine {
	private String engineBrand;
	private int hp;
	private String fuelType;

	public Engine(String engineBrand, int hp, String fuelType) {
		super();
		this.engineBrand = engineBrand;
		this.hp = hp;
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [engineBrand=" + engineBrand + ", hp=" + hp + ", fuelType=" + fuelType + "]";
	}

}
