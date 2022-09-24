package myPackage;

import java.util.Scanner;

public class AdditionExample {

	public static void main(String[] args) {

		System.out.println("Enter the two numbers");

		int first, second;
		first = 10;
		second = 20;

		System.out.println(first + " " + second);
		int sum = first + second;
		System.out.println("Sum of two numbers is:" + sum);

		// Leap year Programming
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int reminder = year % 4;

		// System.out.println(reminder);
		if (reminder == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
		sc.close();
	}

}
