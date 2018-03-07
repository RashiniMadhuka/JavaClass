package com.madhuka.JavaClass;
import java.util.Scanner;
public class Q_eleven {

	private static Scanner num;

	public static void main(String[] args) {
		num = new Scanner(System.in);
		float num1, num2,num3;
		System.out.print("Enter Your Number 1 : ");
		num1 = num.nextFloat();
		System.out.print("Enter Your Number 2 : ");
		num2 = num.nextFloat();
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("Your Number 1 after swapping : "+num1);
		System.out.println("Your Number 2 after swapping : "+num2);
}
}