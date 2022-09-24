package com.array;

import java.util.Scanner;

public class SumOfEven_OddPrimeOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		Initializing the size of an Array..!
		System.out.println("Enter the size of an Array...!");
		int size = scanner.nextInt();
		int[] arr = new int[size];

//		inserting the values in an Array...!
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the value at array index of : " + i);
			arr[i] = scanner.nextInt();
		}
		System.out.println();

//		Array printing..!
		System.out.print("Given Array is : [ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
		}
		System.out.println("]");

		int[] evenArr = new int[arr.length];
		int[] oddArr = new int[arr.length];

		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[i] = arr[i];
			} else {
				oddArr[i] = arr[i];
			}
		}
//		Even array...!
		System.out.print("Even array : [ ");
		for (int even : evenArr) {
			if (even != 0) {
				System.out.print(even + " ");
				evenSum = evenSum + even;
			}
		}
		System.out.println("]");

//		Odd array...!
		System.out.print("Odd array : [ ");
		for (int odd : oddArr) {
			if (odd != 0) {
				System.out.print(odd + " ");
				oddSum = oddSum + odd;
			}
		}
		System.out.println("]");
		System.out.println("---------------------------------");

		System.out.println("Even sum : " + evenSum);
		System.out.println("Odd sum : " + oddSum);
		System.out.println("---------------------------------");

//		Find sum of even is prime or not.
		int count = 0;
		for (int i = 1; i <= evenSum / 2; i++) {
			if (evenSum % 1 == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Sum of Even array " + evenSum + " is Prime.");
		} else {
			System.out.println("Sum of Even array " + evenSum + " is not Prime.");
		}

//		Find sum of odd is prime or not.
		int count1 = 0;
		for (int i = 1; i <= oddSum / 2; i++) {
			if (oddSum % 1 == 0) {
				count1++;
			}
		}
		if (count1 == 0) {
			System.out.println("Sum of Odd array " + oddSum + " is Prime.");
		} else {
			System.out.println("Sum of Odd array " + oddSum + " is not Prime.");
		}

	}

}
