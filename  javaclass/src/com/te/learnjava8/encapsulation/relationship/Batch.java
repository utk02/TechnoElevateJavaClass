package com.te.learnjava8.encapsulation.relationship;

import java.time.LocalDate;

public class Batch {
	private String batchId;
	private LocalDate batchStartDate;
	private LocalDate batchEndDate;
	/**
	 * Here we are declaring the Mentor type variable but not initializing it
	 */
	private Mentor mentor; // Late instantiation

	public Batch() {
		super();
	}

	public Batch(String batchId, LocalDate batchStartDate, LocalDate batchEndDate) {
		super();
		this.batchId = batchId;
		this.batchStartDate = batchStartDate;
		this.batchEndDate = batchEndDate;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public LocalDate getBatchStartDate() {
		return batchStartDate;
	}

	public void setBatchStartDate(LocalDate batchStartDate) {
		this.batchStartDate = batchStartDate;
	}

	public LocalDate getBatchEndDate() {
		return batchEndDate;
	}

	public void setBatchEndDate(LocalDate batchEndDate) {
		this.batchEndDate = batchEndDate;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	/**
	 * Following methods are used to achieve late instantiation
	 * 
	 */
	public void createMentorObject() { // Helper method
		mentor = new Mentor("TY01012", "TYMentor1");
	}

	/**
	 * We are able 
	 * @return
	 */
	public static Mentor createMentorObject2() { // Helper method
		return new Mentor();
	}

	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", batchStartDate=" + batchStartDate + ", batchEndDate=" + batchEndDate
				+ ", mentor=" + mentor + "]";
	}

}
