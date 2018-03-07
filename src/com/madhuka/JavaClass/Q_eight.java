package com.madhuka.JavaClass;

public class Q_eight {
	public static void main(String[] args) {

		int[] numbers = { 4, 5, 9, 11, 6, 3, 2, 29, 64, 18 };
		int largest = numbers[0];
		int smallest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println("Largest number is : " + largest);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest number is : " + smallest);
	}
}
