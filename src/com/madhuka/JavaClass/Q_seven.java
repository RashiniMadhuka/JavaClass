package com.madhuka.JavaClass;
import java.util.Scanner;
public class Q_seven {
	private static Scanner num;

	public static void main(String[] args) {
		num = new Scanner(System.in);
		float length,width;
		System.out.print("Enter Your Length : ");
		length = num.nextFloat();
		System.out.print("Enter Your Width : ");
		width = num.nextFloat();
		System.out.println("Perimeter of the rectangle is : " + ((length*2)+(width*2)));

	}

}