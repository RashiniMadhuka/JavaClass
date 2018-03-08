package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_thirteen {

	private static Scanner num;

	public static void main(String[] args) {
		num = new Scanner(System.in);
		int dividend, divisor;
		System.out.print("Enter Your Dividend : ");
		dividend = num.nextInt();
		System.out.print("Enter Your Divisor : ");
		divisor = num.nextInt();
		int quotient= dividend/divisor;
		int remainder= dividend%divisor;
        System.out.println("Quotient is : "+quotient);
        System.out.println("Remainder is : "+remainder);

}
}