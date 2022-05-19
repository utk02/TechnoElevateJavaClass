package com.te.learnjava8.basic.encapsulation.relationsip.assignment1;

public class Actor {
	private String actorName;
	private double actorFees;
	private int actorExperience;

	public Actor(String actorName, double actorFees, int actorExperience) {
		super();
		this.actorName = actorName;
		this.actorFees = actorFees;
		this.actorExperience = actorExperience;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public double getActorFees() {
		return actorFees;
	}

	public void setActorFees(double actorFees) {
		this.actorFees = actorFees;
	}

	public int getActorExperience() {
		return actorExperience;
	}

	public void setActorExperience(int actorExperience) {
		this.actorExperience = actorExperience;
	}

	@Override
	public String toString() {
		return "Actor [actorName=" + actorName + ", actorFees=" + actorFees + ", actorExperience=" + actorExperience
				+ "]";
	}

}
