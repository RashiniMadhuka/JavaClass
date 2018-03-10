package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_thirtyfive {
	private static Scanner input;

	public static void main(String[] args) {

		int input_1;
		input = new Scanner(System.in);
		System.out.print("Enter your number : ");
		input_1 = input.nextInt();
		if (input_1 > 0)
			System.out.println("The entered number is a positive number");
		else if (input_1 < 0)
			System.out.println("The entered number is a negative number");
		else
			System.out.println("You entered zero");
	}
}