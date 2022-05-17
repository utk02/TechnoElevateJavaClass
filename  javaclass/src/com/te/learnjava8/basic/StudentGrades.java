package com.te.learnjava8.basic;

import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Grades");
		int grades = scanner.nextInt();

		switch (grades) {
		case 0: { // giving range is not possible in switch case
			System.out.println("BELOW_AVERAGE");
		}
			break;
		case 60: {
			System.out.println("AVERAGE");
		}
			break;
		case 70: {
			System.out.println("ABOVE_AVERAGE");
		}
			break;
		case 80: {
			System.out.println("GOOD");
		}
			break;
		case 90: {
			System.out.println("EXCELENT");
		}

		default:
			break;
		}
	}

}
