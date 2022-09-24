package com.restaurant;

public class Billing {

	double totalAmt;

	public void bill() {
		System.out.println();
		System.err.println("---------Welcome to Restaurant JBK..!--------");
		JbkRestaurant.biriyani.briyaniBill();
		JbkRestaurant.drinks.drinkBill();
		JbkRestaurant.iceream.iceBill();
		JbkRestaurant.billing.totalBill();
		System.err.println("---------------------------------------------");
		System.out.println();
	}

	public void totalBill() {
		this.totalAmt = JbkRestaurant.biriyani.birTotalBill() + JbkRestaurant.drinks.dirTotalBill()
				+ JbkRestaurant.iceream.iceTotalBill();

		System.out.println("Total Amout is : " + this.totalAmt);
	}

}
