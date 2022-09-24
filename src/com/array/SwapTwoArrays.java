package com.array;

import java.util.Scanner;

public class SwapTwoArrays {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		Initializing the size of an Array..!
		System.out.println("Enter the size of an Array...!");
		int size = scanner.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

//		inserting the values in an Array...!
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.println("Enter the value in array-1 at index of : " + i);
			arr1[i] = scanner.nextInt();
		}
		System.out.println();

//		inserting the values in an Array...!
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.println("Enter the value in array-2 at index of : " + i);
			arr2[i] = scanner.nextInt();
		}

//		Before swapping an array..!
		System.out.println("Before swapping an array..!");
		System.out.print(" Array-1 : [ ");
		for (int ex1 : arr1) {
			System.out.print(ex1 + " ");
		}
		System.out.println("]");

		System.out.print(" Array-2 : [ ");
		for (int ex2 : arr2) {
			System.out.print(ex2 + " ");
		}
		System.out.println("]");
		System.out.println();

		int[] temp = new int[arr1.length];
		for (int i = 0; i <= arr1.length - 1; i++) {
			temp[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp[i];
		}

//		After swapping an array..!
		System.out.println("After swapping an array..!");
		System.out.print(" Array-1 : [ ");
		for (int ex1 : arr1) {
			System.out.print(ex1 + " ");
		}
		System.out.println("]");

		System.out.print(" Array-2 : [ ");
		for (int ex2 : arr2) {
			System.out.print(ex2 + " ");
		}
		System.out.println("[ ");

	}

}
