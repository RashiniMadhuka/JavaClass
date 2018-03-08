package com.madhuka.JavaClass;

import java.util.Scanner;

public class Q_twenty {

	private static Scanner input;

	public static void main(String[] args) {
		int FirstNumber = 1;
		int SecondNumber = 1;
		int CurrentNumber = 0;
		input = new Scanner(System.in);
		int input_1;
		System.out.print("Up to which number do you want the fibonacci series? : ");
		input_1 = input.nextInt();
		while (CurrentNumber <=input_1) {
			System.out.print(" "+CurrentNumber);
			FirstNumber = SecondNumber;
			SecondNumber = CurrentNumber;
			CurrentNumber = FirstNumber + SecondNumber;
			
		}
	}

}
/*public static void main(String[] args) {

    int n = 100, t1 = 0, t2 = 1;
    
    System.out.print("Upto " + n + ": ");
    while (t1 <= n)
    {
        System.out.print(t1 + " + ");

        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
    }
}*/