package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_two {

	private static Scanner num;

	public static void main(String[] args) {

		num = new Scanner(System.in);
		int input ;
		System.out.print("Enter Your Number : ");
		input = num.nextInt();
		System.out.println("Your Number Is : " + input);

	}
}
