package com.array;

import java.util.Scanner;

public class EvenOddInAnArray {

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

//		Array printing..!
		System.out.print("Given array is : [ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
		}
		System.out.println("]");
		System.out.println();

//		Even odd Array...!
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
		System.out.println();

//		Odd array...!
		System.out.print("Odd array : [ ");
		for (int odd : oddArr) {
			if (odd != 0) {
				System.out.print(odd + " ");
				oddSum = oddSum + odd;
			}
		}
		System.out.println("]");
		System.out.println("----------------------------------");

		System.out.println("Sum of Even array : " + evenSum);
		System.out.println("Sum of Odd array : " + oddSum);
	}

}
