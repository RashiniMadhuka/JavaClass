package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_fifteen {

	private static Scanner num;

	public static void main(String[] args) {
		num = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("Enter Your Number 1 : ");
		num1 = num.nextInt();
		System.out.print("Enter Your Number 2 : ");
		num2 = num.nextInt();
		System.out.print("Enter Your Number 3 : ");
		num3 = num.nextInt();
		if (num1 > num2 & num1 > num3) {
			System.out.println(num1 +" is the largest among 3 numbers");
		} else if (num2 > num1 & num2 > num3) {
			System.out.println(num2 +" is the largest among 3 numbers");
		} else {
			System.out.println(num3 +" is the largest among 3 numbers");
		}

	}
}
