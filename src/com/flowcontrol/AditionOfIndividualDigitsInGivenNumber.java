package com.flowcontrol;

public class AditionOfIndividualDigitsInGivenNumber {

	public static void main(String[] args) {
		int num = 1234;
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Adition of individual digits in " + temp + " is : " + sum);

	}

}
