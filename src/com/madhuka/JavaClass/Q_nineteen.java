package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_nineteen {

	private static Scanner input;
	
	public static void main(String[] args) {
		int FirstNumber=1;
		int SecondNumber=1;
		int CurrentNumber=0;
		input = new Scanner(System.in);
		int input_1;
		System.out.print("Up to which number of terms do you want in the fibonacci series? : ");
		input_1 = input.nextInt();
		for (int i=1;i<=input_1;i++) {
			FirstNumber=SecondNumber;
			SecondNumber=CurrentNumber;
			CurrentNumber=FirstNumber+SecondNumber;
			if(i==1)System.out.println("1st term = "+CurrentNumber);
			else if(i==2)System.out.println("2nd term = "+CurrentNumber);
			else if(i==3)System.out.println("3rd term = "+CurrentNumber);
			else System.out.println(i+"th term = "+CurrentNumber);
		}
	}

}
