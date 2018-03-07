package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_nine {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num;
		double factorial=1.0;
		System.out.print("Enter Your Number : ");
		num = input.nextInt();
        for(int i=1;i<=num;i++) {
        	factorial=factorial*i;
        }
        System.out.println("Factorial of your number is : "+factorial);
	}
}