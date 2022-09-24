package com.restaurant;

import java.util.Scanner;

public class Drinks {
	Scanner scanner = new Scanner(System.in);
	double tea = 10;
	double coffe = 15;
	double thumsUp = 25;
	double pepsi = 25;

//	billing variables..!
	double teaCups;
	double coffeCups;
	double thuBottles;
	double pepBottles;

	double teaAmt;
	double coffeAmt;
	double thuAmt;
	double pepAmt;

	double drinksTotal;

	public void drinks() {
		System.out.println("---------------******--------------");
		System.out.println("Click 1 for Hot Drinks..!");
		System.out.println("Click 2 for Cool Drinks..!");
		System.out.println("---------------******--------------");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			this.hotDrinks();
			break;
		}
		case 2: {
			this.coolDrinks();
			break;
		}
		default: {
			System.err.println("Enter the valid input 1 to 2.");
			break;

		}

		}
	}

	public void hotDrinks() {
		System.out.println("---------------******--------------");
		System.out.println("Click 1 for Tea..!");
		System.out.println("Click 2 for Coffe");
		System.out.println("---------------******--------------");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			this.tea();
			break;
		}
		case 2: {
			this.coffe();
			break;
		}
		default: {
			System.err.println("Sorry plz enter valid input..!");
			break;
		}

		}
	}

	public void coolDrinks() {
		System.out.println("---------------******--------------");
		System.out.println("Click 1 for ThumsUp..!");
		System.out.println("Click 2 for Pepsi..!");
		System.out.println("---------------******--------------");
		int input = scanner.nextInt();
		switch (input) {
		case 1: {
			this.tUp();
			break;
		}
		case 2: {
			this.pep();
			break;
		}
		default: {
			System.err.println("Sorry plz enter valid input..!");
			break;
		}

		}
	}

//	Hot Drinks..!
	public void tea() {
		System.out.println("Each Tea cost is : " + this.tea);
		System.out.println("Now enter the No.of cup's..!");
		double num = scanner.nextInt();
		double price = num * this.tea;
		this.teaCups = this.teaCups + num;
		System.out.println("Tea cost for " + (int) num + " Tea is : " + price);
		this.teaAmt = this.teaAmt + price;
	}

	public void coffe() {
		System.out.println("Each Coffe cost is : " + this.coffe);
		System.out.println("Now enter the No.of cup's..!");
		double num = scanner.nextInt();
		double price = num * this.coffe;
		this.coffeCups = this.coffeCups + num;
		System.out.println("Coffe cost for " + (int) num + " Coffe is : " + price);
		this.coffeAmt = this.coffeAmt + price;
	}

//	Cool Drinks..!
	public void tUp() {
		System.out.println("Each Drink cost is : " + this.thumsUp);
		System.out.println("Now enter the No.of ThumsUp's..!");
		double num = scanner.nextInt();
		double price = num * this.thumsUp;
		this.thuBottles = this.thuBottles + num;
		System.out.println("Drinks cost for " + (int) num + " Thumsup's is : " + price);
		this.thuAmt = this.thuAmt + price;

	}

	public void pep() {
		System.out.println("Each Drink cost is : " + this.pepsi);
		System.out.println("Now enter the No.of Pepsi..!");
		double num = scanner.nextInt();
		double price = num * this.pepsi;
		this.pepBottles = this.pepBottles + num;
		System.out.println("Drinks cost for " + (int) num + " Pepsi is : " + price);
		this.pepAmt = this.pepAmt + price;

	}

//	Billing Drinks..!
	public void drinkBill() {
		if (this.teaAmt > 0) {
			System.out.println("Tea bill for " + (int) this.teaCups + " is : " + this.teaAmt);
		}
		if (this.coffeAmt > 0) {
			System.out.println("Coffe bill for " + (int) this.coffeCups + " is : " + this.coffeAmt);
		}
		if (this.thuAmt > 0) {
			System.out.println("ThumsUp bill for " + (int) this.thuBottles + " is : " + this.thuAmt);
		}
		if (this.pepAmt > 0) {
			System.out.println("Pepsi bill for " + (int) this.pepBottles + " is : " + this.pepAmt);
		}
	}

	public double dirTotalBill() {
		return this.drinksTotal = this.teaAmt + this.coffeAmt + this.thuAmt + this.pepAmt;
	}

}
