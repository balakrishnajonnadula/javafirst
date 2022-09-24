package myPackage;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// get text input
		System.out.println("Enter first Number");

		int first = sc.nextInt();

		System.out.println("First Number is  : " + first);

		System.out.println("Enter Second Number");
		int second = sc.nextInt();
		System.out.println("Second Number is : " + second);

		System.out.println("Product of " + first + " X " + second);
		System.out.println(first + " X " + second + " = " + first * second);

		// close the scanner
		sc.close();
	}

}
