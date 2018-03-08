package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_sixteen {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double num, power,answer=1;
		System.out.print("Enter Your Number : ");
		num = input.nextDouble();
		System.out.print("Enter Your Power : ");
		power = input.nextDouble();
		for(int i=1; i<=power; i++) {
			answer=answer*num;
		}
	    System.out.println("Answer is : "+answer);
	}}