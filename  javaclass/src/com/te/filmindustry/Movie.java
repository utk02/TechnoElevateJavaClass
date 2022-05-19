package com.te.filmindustry;

public class Movie {
	private String name;
	// Early instantiation or tight coupling or composition
	private Director d1 = new Director("Rajamouli", "Mistry");

	public Movie() {
		super();
	}

	public Movie(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Director getD1() {
		return d1;
	}

	public void setD1(Director d1) {
		this.d1 = d1;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", d1=" + d1 + "]";
	}

}
