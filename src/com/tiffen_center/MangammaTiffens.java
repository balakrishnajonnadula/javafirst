package com.tiffen_center;

import java.util.Scanner;

public class MangammaTiffens {
	static Scanner scanner = new Scanner(System.in);

	static int idlyPlates;
	static double idlyTotalPrice;

	static int dosaPlates;
	static double dosaTotalPrice;

	static int puriPlates;
	static double puriTotalPrice;

	static int vadaPlates;
	static double vadaTotalPrice;

	static double toatlTiffenBill;

	public static void main(String[] args) {
		while (true) {
			System.out.println("------------Welcome to Mangamma Tiffines------------");
			System.out.println("Click 1 for Tiffens Menu..!");
			System.out.println("Click 2 Cancel.");
			int input = scanner.nextInt();
			switch (input) {
			case 1: {
				MangammaTiffens.order();
				break;
			}
			case 2: {
				MangammaTiffens.totalBill();
				if (MangammaTiffens.toatlTiffenBill > 0) {
					MangammaTiffens.receipt();
				}
				System.out.println("Thank you visit again..!");
				System.exit(0);
			}
			default: {
				System.err.println("Enter valid input Between 1 to 2.");
			}
			}
		}
	}

	public static void order() {
		System.out.println("Click 1 for Order Idly..!");
		System.out.println("Click 2 for Order Dosa..!");
		System.out.println("Click 3 for Order Puri..!");
		System.out.println("Click 4 for Order vada..!");
		System.out.println("Click 5 for Back to main menu..!");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			MangammaTiffens.idly();
			break;
		}
		case 2: {
			MangammaTiffens.dosa();
			break;
		}
		case 3: {
			MangammaTiffens.puri();
			break;
		}
		case 4: {
			MangammaTiffens.vada();
			break;
		}
		case 5: {
			MangammaTiffens.main(null);
			break;
		}
		default: {
			System.err.println("Enter the valid input between 1 to 4");
		}

		}
	}

	public static void idly() {
		double idlyPrice = 30;
		System.out.println("Each plate cost is : " + idlyPrice + " Rs.");
		System.out.println("Now Enter the No of Idly plates..!");
		int plates = scanner.nextInt();
		MangammaTiffens.idlyPlates = MangammaTiffens.idlyPlates + plates;
		double total = plates * idlyPrice;
		MangammaTiffens.idlyTotalPrice = MangammaTiffens.idlyTotalPrice + total;
		MangammaTiffens.navigate();
	}

	public static void dosa() {
		double dosaPrice = 35;
		System.out.println("Each plate cost is : " + dosaPrice + " Rs.");
		System.out.println("Now Enter the No of Dosa plates..!");
		int plates = scanner.nextInt();
		MangammaTiffens.dosaPlates = MangammaTiffens.dosaPlates + plates;
		double total = plates * dosaPrice;
		MangammaTiffens.dosaTotalPrice = MangammaTiffens.dosaTotalPrice + total;
		MangammaTiffens.navigate();
	}

	public static void puri() {
		double idlyPrice = 25;
		System.out.println("Each plate cost is : " + idlyPrice + " Rs.");
		System.out.println("Now Enter the No of Idly plates..!");
		int plates = scanner.nextInt();
		MangammaTiffens.puriPlates = MangammaTiffens.puriPlates + plates;
		double total = plates * idlyPrice;
		MangammaTiffens.puriTotalPrice = MangammaTiffens.puriTotalPrice + total;
		MangammaTiffens.navigate();
	}

	public static void vada() {
		double idlyPrice = 30;
		System.out.println("Each plate cost is : " + idlyPrice + " Rs.");
		System.out.println("Now Enter the No of Idly plates..!");
		int plates = scanner.nextInt();
		MangammaTiffens.vadaPlates = MangammaTiffens.vadaPlates + plates;
		double total = plates * idlyPrice;
		MangammaTiffens.vadaTotalPrice = MangammaTiffens.vadaTotalPrice + total;
		MangammaTiffens.navigate();
	}

	public static void navigate() {
		System.out.println("Press 1 for Re-order..!");
		System.out.println("press 2 for Main Menu..!");
		System.out.println("Press 3 for Bill Recipt..!");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			MangammaTiffens.order();
			break;
		}
		case 2: {
			MangammaTiffens.main(null);
			break;
		}
		case 3: {
			MangammaTiffens.receipt();
			MangammaTiffens.totalBill();
			break;
		}
		default: {
			System.err.println("Enter the valid input between 1 to 3.");
			MangammaTiffens.navigate();
		}

		}
	}

	public static void receipt() {

		if (MangammaTiffens.idlyTotalPrice > 0) {
			System.out.println(
					"Idly price for " + MangammaTiffens.idlyPlates + " is : " + MangammaTiffens.idlyTotalPrice);
		}
		if (MangammaTiffens.dosaTotalPrice > 0) {
			System.out.println(
					"Dosa price for " + MangammaTiffens.dosaPlates + " is : " + MangammaTiffens.dosaTotalPrice);
		}
		if (MangammaTiffens.puriTotalPrice > 0) {
			System.out.println(
					"Puri price for " + MangammaTiffens.puriPlates + " is : " + MangammaTiffens.puriTotalPrice);
		}
		if (MangammaTiffens.vadaTotalPrice > 0) {
			System.out.println(
					"Vada price for " + MangammaTiffens.vadaPlates + " is : " + MangammaTiffens.vadaTotalPrice);
		}
		MangammaTiffens.totalBill();
		System.out.println("-----------------------------------------");
		System.out.println("Total Bill is : " + MangammaTiffens.toatlTiffenBill);

	}

	public static void totalBill() {
		MangammaTiffens.toatlTiffenBill = MangammaTiffens.dosaTotalPrice + MangammaTiffens.idlyTotalPrice
				+ MangammaTiffens.puriTotalPrice + MangammaTiffens.vadaTotalPrice;
	}

}
