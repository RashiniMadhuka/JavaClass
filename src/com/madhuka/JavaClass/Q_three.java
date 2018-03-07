package com.madhuka.JavaClass;
import java.util.Scanner;
public class Q_three {

	private static Scanner num;
	public static void main(String[] args) {
		num = new Scanner(System.in);
		float input_1,input_2 ;
		System.out.print("Enter Your Number 1 : ");
		input_1 = num.nextFloat();
		System.out.print("Enter Your Number 2 : ");
		input_2 = num.nextFloat();
		System.out.println("Addition Is : " + (input_1+input_2));
	}

}
