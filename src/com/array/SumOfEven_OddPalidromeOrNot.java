package com.array;

import java.util.Scanner;

public class SumOfEven_OddPalidromeOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an Array..!");
		int size = scanner.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the value in an array at the index of : " + i);
			arr[i] = scanner.nextInt();
		}

		int[] evenArr = new int[arr.length];
		int[] oddArr = new int[arr.length];

		int oddSum = 0;
		int evenSum = 0;

//		Given Array is..!
		System.out.println("Given Array..!");
		System.out.print("[ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
		}
		System.out.println("]");
		System.out.println();

//		inserting values into even array and odd Array..!

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[i] = arr[i];
			} else {
				oddArr[i] = arr[i];
			}
		}

//		Even array...!
		System.out.println("Even Array is..!");
		System.out.print("[ ");
		for (int even : evenArr) {
			if (even != 0) {
				System.out.print(even + " ");
				evenSum = evenSum + even;
			}
		}
		System.out.println("]");
		System.out.println();

//		Odd array...!
		System.out.println("Odd Array..!");
		System.out.print("[ ");
		for (int odd : oddArr) {
			if (odd != 0) {
				System.out.print(odd + " ");
				oddSum = oddSum + odd;
			}
		}
		System.out.println("]");
		System.out.println();

		System.out.println("Sum of even array : " + evenSum);
		System.out.println("Sum of odd array : " + oddSum);
		System.out.println();

//		Even sum of an Array is palindrome or not..!
		int sum = 0;
		int temp = evenSum;
		while (evenSum > 0) {
			int rem = evenSum % 10;
			sum = sum * 10 + rem;
			evenSum = evenSum / 10;
		}
		if (temp == sum) {
			System.out.println("Even sum of an Array " + temp + " is Palidrome.");
		} else {
			System.out.println("Even sum of an Array " + temp + " not a is Palidrome.");
		}
		System.out.println();

//		Odd sum of an Array is palindrome or not..!
		int sum1 = 0;
		int temp1 = oddSum;
		while (oddSum > 0) {
			int rem = oddSum % 10;
			sum = sum * 10 + rem;
			oddSum = oddSum / 10;
		}
		if (temp1 == sum1) {
			System.out.println("odd sum of an Array " + temp1 + " is Palidrome.");
		} else {
			System.out.println("Odd sum of an Array " + temp1 + " not a is Palidrome.");
		}

	}

}
