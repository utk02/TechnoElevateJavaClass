package com.te.learnjava8.basic.encapsulation.relationsip.assignment1;

public class Director {
	private String directorName;
	private double directorFees;
	private int directorExperience;

	public Director(String directorName, double directorFees, int directorExperience) {
		super();
		this.directorName = directorName;
		this.directorFees = directorFees;
		this.directorExperience = directorExperience;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public double getDirectorFees() {
		return directorFees;
	}

	public void setDirectorFees(double directorFees) {
		this.directorFees = directorFees;
	}

	public int getDirectorExperience() {
		return directorExperience;
	}

	public void setDirectorExperience(int directorExperience) {
		this.directorExperience = directorExperience;
	}

	@Override
	public String toString() {
		return "Director [directorName=" + directorName + ", directorFees=" + directorFees + ", directorExperience="
				+ directorExperience + "]";
	}

}
