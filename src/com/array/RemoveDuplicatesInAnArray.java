package com.array;

import java.util.Scanner;

public class RemoveDuplicatesInAnArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		Initializing the size of an Array..!
		System.out.println("Enter the size of an Array...!");
		int size = scanner.nextInt();

		int[] arr = new int[size];

// 		inserting the values in an Array...!
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the value at array index of : " + i);
			arr[i] = scanner.nextInt();
		}

//		Printing an Array..!
		System.out.print("Before Removing duplicates : [ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
		}
		System.out.println("]");

		System.out.println("---------------------------------------------------");

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = 0;
				}
			}
		}

//		Printing the array after removing duplicates..!
		System.out.print("After Removing duplicates : [ ");
		for (int ex : arr) {
			if (ex != 0)
				System.out.print(ex + " ");
		}
		System.out.println("]");

	}

}
