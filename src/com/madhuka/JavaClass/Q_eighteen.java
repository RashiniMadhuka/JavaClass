package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_eighteen {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num1, num2;
		System.out.print("Which number of multiplication table do you want? : ");
		num1 = input.nextInt();
		System.out.print("Up to which number of multiplies do you want? : ");
		num2 = input.nextInt();
		for (int i = 1; i <= num2; i++) {
			System.out.println( num1+" * "+i+  " = " + (num1*i));
		}
	}
}