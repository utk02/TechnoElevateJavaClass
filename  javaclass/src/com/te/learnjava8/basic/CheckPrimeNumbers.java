package com.te.learnjava8.basic;

/**
 * program to check if the given number is prime or not
 * 
 * @author utk date 16/05/2022
 */

public class CheckPrimeNumbers {

	/**
	 * accepts int value and returns true if it is prime number else returns false
	 * 
	 * @param num
	 * @return
	 */

	public static boolean checkPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 32; // sample input
		if (checkPrime(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
