package com.training;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num check number is prime or Not?");
		int num = scanner.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " ");
		}

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
