package com.te.learnjava8.basic;

public class LargestOfFiveNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;

		int large = ((a > b ? a : b) > (c > d ? c : d) ? (a > b ? a : b) : (c > d ? c : d)) > e
				? ((a > b ? a : b) > (c > d ? c : d) ? (a > b ? a : b) : (c > d ? c : d))
				: e;

		/*
		 * alternative logic
		 */
		int res = (a > b && a > c && a > d && a > e) 
				? a : (b > c && b > d && b > e) 
						? b : (c > d && c > e) 
								? c : (d > e) 
										? d : e;
		
		System.out.println(large + " is the largest");
		System.out.println(res + " is the largest");

	}
}
