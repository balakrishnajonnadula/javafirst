package com.array;

import java.util.Scanner;

public class SumOfEven_OddArmStrongOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an Array..!");
		int size = scanner.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the value in an array at the index of : " + i);
			arr[i] = scanner.nextInt();
		}

		int arrSum = 0;

//		Given Array is..!
		System.out.println("Given Array..!");
		System.out.print("[ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
			arrSum = arrSum + ex;
		}
		System.out.println("]");
		System.out.println();

		System.out.println("Sum of an Array is : " + arrSum);

		if (arrSum >= 100 && arrSum <= 999) {
			int temp = arrSum;
			int sum = 0;
			while (arrSum > 0) {
				int rem = arrSum % 10;
				sum = sum + armStrong(rem);
				arrSum = arrSum / 10;
			}
			if (temp == sum) {
				System.out.println(temp + " is Armstrong Number..!");
			} else {
				System.out.println(temp + " is not a Armstrong Number..!");
			}
		} else {
			System.err.println("Sum of array is not less than 100 or more than 999\nTo caluclate Armstrong Number..!");
		}

	}

	public static int armStrong(int rem) {
		return rem * rem * rem;
	}

}
