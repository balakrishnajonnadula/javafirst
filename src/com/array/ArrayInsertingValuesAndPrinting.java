package com.array;

import java.util.Scanner;

public class ArrayInsertingValuesAndPrinting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array..!");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the value at the index of : " + i);
			arr[i] = scanner.nextInt();
		}

		System.out.println("Now printing the Array : ");
		System.out.print("[ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
		}
		System.out.println("]");

	}

}
