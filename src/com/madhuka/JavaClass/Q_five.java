package com.madhuka.JavaClass;
import java.util.Scanner;
public class Q_five {
	private static Scanner num;
	public static void main(String[] args) {
		num = new Scanner(System.in);
		float radius;
		System.out.print("Enter Your Radius : ");
		radius = num.nextFloat();
		double circumference = 2*(22.0 / 7.0) * radius;
		System.out.println("Area of the circle is : " + circumference);

		
	}

}
