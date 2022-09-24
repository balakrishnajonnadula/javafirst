package com.flowcontrol;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number and get Reverse Number..!");
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a palidrome number..!");
		} else {
			System.out.println(temp + " is not a palidrome..!");
		}

	}

}
