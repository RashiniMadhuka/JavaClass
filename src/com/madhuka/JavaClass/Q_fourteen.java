package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_fourteen {
	private static Scanner num;

	public static void main(String[] args) {
		num = new Scanner(System.in);
		int number;
		System.out.print("Enter Your Number : ");
		number = num.nextInt();
		if (number % 2 == 0) {
			System.out.println("Your Number Is Even");
		} else {
			System.out.println("Your Number Is Odd");
		}

	}
}