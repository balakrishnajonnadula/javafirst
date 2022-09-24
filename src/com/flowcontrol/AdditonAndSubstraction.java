package com.flowcontrol;

import java.util.Scanner;

public class AdditonAndSubstraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Click 1 for Addition..!");
		System.out.println("Click 2 for Substraction..!");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			System.out.println("Enter the first Number..!");
			int fNo = scanner.nextInt();
			System.out.println("Enter the second Number..!");
			int sNO = scanner.nextInt();
			System.out.println(additon(fNo, sNO));
			break;
		}
		case 2: {
			System.out.println("Enter the first Number..!");
			int fNo = scanner.nextInt();
			System.out.println("Enter the second Number..!");
			int sNO = scanner.nextInt();
			System.out.println(sub(fNo, sNO));
			break;
		}
		default: {
			System.out.println("Enter the valid input...!");
			break;
		}
		}

	}

	public static int additon(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

}
