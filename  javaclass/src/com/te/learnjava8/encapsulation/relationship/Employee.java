package com.te.learnjava8.encapsulation.relationship;

import java.time.LocalDate;

/**
 * Encapsulation example Employee form
 * 
 * @author utk
 *
 */
public class Employee {
	private String employeeId;
	private String employeeName;
	private int employeeAge;
	private long employeePhoneNumber;

	/**
	 * Here we do early instantiation of batch i.e. Object of Batch class will be
	 * created automatically whenever Employee object is created
	 */
	private Batch batch = new Batch("TYTE04", LocalDate.now(), LocalDate.of(2022, 05, 31)); // Early instantiation

	public Employee() {

	}

	public Employee(String employeeId, String employeeName, int employeeAge, long employeePhoneNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeePhoneNumber = employeePhoneNumber;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		if (employeeAge <= 0) {
			System.out.println("Entered age is not correct");
		} else {
			this.employeeAge = employeeAge;
		}
	}

	public long getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public void setEmployeePhoneNumber(long employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", employeePhoneNumber=" + employeePhoneNumber + ", batch=" + batch + "]";
	}

}
