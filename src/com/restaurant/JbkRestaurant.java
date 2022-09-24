package com.restaurant;

import java.util.Scanner;

public class JbkRestaurant {
	static Scanner scanner = new Scanner(System.in);
	static Biriyani biriyani = new Biriyani();
	static Iceream iceream = new Iceream();
	static Drinks drinks = new Drinks();
	static Billing billing = new Billing();

	public static void main(String[] args) {
		while (true) {
			System.out.println("---------------******--------------");
			System.out.println("Click 1 for Biriyani menu..!");
			System.out.println("Click 2 for Iceream menu..!");
			System.out.println("Click 3 for Dirks menu..!");
			System.out.println("Click 4 for Billing..!");
			System.out.println("Click 5 for Exit menu..!");
			System.out.println("---------------******--------------");
			int input = scanner.nextInt();
			switch (input) {
			case 1: {
				biriyani.biryanies();
				break;
			}
			case 2: {
				iceream.icereams();
				break;
			}
			case 3: {
				drinks.drinks();
				break;
			}
			case 4: {
				billing.bill();
				break;
			}
			case 5: {
				System.out.println("Thank you visit Again..!");
				System.exit(0);
			}

			default:
				System.err.println("Enter the valid input between 1 to 4.");
				break;
			}
		}
	}
}
