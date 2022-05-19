package com.te.learnjava8.presentation;
/**
 * This is an example to explain encapsulation
 * @author Utk
 *
 */
public class ATM {
	private String bankName; //Only show the bankName, not modify
	private double atmBalance; //Only modify, not show
	private int id; // Niether show not modify
	private int pin = 1234;

	public ATM(String bankName, double atmBalance, int id) {
		super();
		this.bankName = bankName;
		this.atmBalance = atmBalance;
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setAtmBalance(int pin, int amt) {

		if (this.pin == pin) {

			System.out.println("Log in succesful");
			atmBalance = atmBalance - amt;
			System.out.println(atmBalance);
		} else {
			System.out.println("Invalid pin... please retry");
		}

	}

}
