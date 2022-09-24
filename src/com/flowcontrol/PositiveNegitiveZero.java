package com.flowcontrol;

import java.util.Scanner;

public class PositiveNegitiveZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value and check positive or negitive or zero..!");
		int value = scanner.nextInt();

		if (value > 0) {
			System.out.println(value + " is positive value..!");
		} else if (value < 0) {
			System.out.println(value + " is negitive value..!");
		} else {
			System.out.println("value is " + value);
		}

	}

}
