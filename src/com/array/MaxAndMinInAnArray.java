package com.array;

import java.util.Scanner;

public class MaxAndMinInAnArray {

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

//		printing an Array...!

		System.out.print("Given Array is : [ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
		}
		System.out.println("]");

		System.out.println("------------------------------------------------");
		System.out.println("Maximum Number in an Array is : " + maxNum(arr));
		System.out.println("Minimum Number in an Array is : " + minNum(arr));
	}

	public static int minNum(int[] arr) {
		int minValue = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	public static int maxNum(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i <= arr.length - 1; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

}
