package com.flowcontrol;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value and check even or not..!");
		int val = scanner.nextInt();
		if (val % 2 == 0) {
			System.out.println(val + " is Even numer..!");
		} else {
			System.out.println(val + " is Odd numer..!");
		}

	}

}
