package com.madhuka.JavaClass;
import java.util.Scanner;
public class Q_four {
	private static Scanner num;
	public static void main(String[] args) {

		num = new Scanner(System.in);
		float radius ;
		System.out.print("Enter Your Radius : ");
		radius = num.nextFloat();
		double  Area=(22.0/7.0)*radius*radius;
		System.out.println("Area of the circle is : " + Area);

	}

}
