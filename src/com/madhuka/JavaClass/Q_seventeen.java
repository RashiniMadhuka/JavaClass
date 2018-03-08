package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_seventeen {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		double num,sum=0;
		System.out.print("Enter Your Natural Number up to which you need the sum : ");
		num = input.nextDouble();
        for(int i=1; i<=num;i++) {
        	sum=sum+i;
        }
        System.out.println("Sum of the numbers is : "+sum);
}}
