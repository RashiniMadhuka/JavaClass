package com.madhuka.JavaClass;

public class Q_twentyfour {

	public static void main(String[] args) {

		int num_1, num_2, num_1cube, num_2cube, num_3cube;

		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i);
		}
		for (int i = 100; i < 1000; i++) {
			num_1 = i / (100);
			num_1cube = num_1 * num_1 * num_1;
			num_2 = i % 100;
			num_2cube = (num_2 / 10) * (num_2 / 10) * (num_2 / 10);
			num_3cube = (num_2 % 10) * (num_2 % 10) * (num_2 % 10);
			if ((num_1cube + num_2cube + num_3cube) == i) {
				System.out.print(" " + i);
			}
		}
	}
}
