package com.flowcontrol;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number and check wether Prime or not..!");
		int num = scanner.nextInt();
		
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(num + " is prime Number..!");
		} else {
			System.out.println(num + " is not prime Number..!");
		}

	}

}
