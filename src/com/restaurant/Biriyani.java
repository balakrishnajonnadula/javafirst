package com.restaurant;

import java.util.Scanner;

public class Biriyani {
	Scanner scanner = new Scanner(System.in);
	double cBiriyani = 240;
	double mBiriyani = 320;

//	Billing variables..!
	double chiPlates;
	double mutPlates;
	double chiPrice;
	double mutPrice;
	double biryaniTotal;

	public void biryanies() {
		System.out.println("---------------******--------------");
		System.out.println("Click 1 for chicken Biriyani..!");
		System.out.println("Click 2 for Mutton Biriyani..!");
		System.out.println("---------------******--------------");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			this.chicken();
			break;
		}
		case 2: {
			this.mutton();
			break;
		}
		default: {
			System.err.println("Enter the valid input 1 to 2.");

		}

		}
	}

	public void chicken() {
		System.out.println("Each plate cost is : " + this.cBiriyani);
		System.out.println("Now enter the number of Plates.");
		double plates = this.scanner.nextInt();
		double price = plates * this.cBiriyani;
		this.chiPlates = this.chiPlates + plates;
		System.out.println(price);
		this.chiPrice = this.chiPrice + price;
	}

	public void mutton() {
		System.out.println("Each plate cost is : " + this.mBiriyani);
		System.out.println("Now enter the number of Plates.");
		double plates = this.scanner.nextInt();
		double price = plates * this.mBiriyani;
		this.mutPlates = this.mutPlates + plates;
		System.out.println(price);
		this.mutPrice = this.mutPrice + price;
	}

	public void briyaniBill() {

		if (this.chiPrice > 0) {
			System.out.println("Chickn Biriyani Price for  " + (int) this.chiPlates + " is " + this.chiPrice);
		}
		if (this.mutPrice > 0) {
			System.out.println("Mutton Biriyani Price for  " + (int) this.mutPlates + " is " + this.mutPrice);
		}

	}

	public double birTotalBill() {
		return this.biryaniTotal = this.chiPrice + this.mutPrice;
	}

}
