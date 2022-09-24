package com.restaurant;

import java.util.Scanner;

public class Iceream {
	Scanner scanner = new Scanner(System.in);
	double butterScoch = 40;
	double vinnila = 35;
//	billing variables
	double butQty;
	double vinnQty;

	double butAmt;
	double vinnAmt;
	double iceToatalBill;

	public void icereams() {
		System.out.println("---------------******--------------");
		System.out.println("Click 1 for Butter Scoch..!");
		System.out.println("Click 2 for Vinnila..!");
		System.out.println("---------------******--------------");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			this.butterIce();
			break;
		}
		case 2: {
			this.vinnelaIce();
			break;
		}
		default: {
			System.err.println("Enter the valid input 1 to 2");
			break;

		}

		}
	}

	public void butterIce() {
		System.out.println("Each iceream price is : " + this.butterScoch);
		System.out.println("Now enter the number of Butter Scoch Icereamas.");
		double plates = this.scanner.nextInt();
		this.butQty = this.butQty + plates;
		double price = plates * this.butterScoch;
		System.out.println(price);
		this.butAmt = this.butAmt + price;
	}

	public void vinnelaIce() {
		System.out.println("Each iceream price is : " + this.vinnila);
		System.out.println("Now enter the number of Vinnila Icereamas.");
		double plates = this.scanner.nextInt();
		this.vinnQty = this.vinnQty + plates;
		double price = plates * this.vinnila;
		System.out.println(price);
		this.vinnAmt = this.vinnAmt + price;
	}

	public void iceBill() {
		if (this.butAmt > 0) {
			System.out.println("Butter Scotch bill for " + (int) this.butQty + " is : " + this.butAmt);
		}
		if (this.vinnAmt > 0) {
			System.out.println("Vinnina bill for " + (int) this.vinnQty + " is : " + this.vinnAmt);
		}
	}
	public double iceTotalBill() {
		return this.iceToatalBill = this.butAmt + this.vinnAmt;
	}
}
