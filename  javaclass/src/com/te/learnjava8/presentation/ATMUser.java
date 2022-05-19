package com.te.learnjava8.presentation;

public class ATMUser {

	public static void main(String[] args) {
		ATM a1 = new ATM("SBI", 20000, 9876);

		System.out.println("Bank Name : " + a1.getBankName());

		// System.out.println(a1.atmBalance); //Direct access is not possible

		a1.setAtmBalance(1234, 5000);
	}

}
