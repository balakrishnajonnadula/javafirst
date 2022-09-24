package com.array;

import java.util.Scanner;

public class Arrayfibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		Initializing the size of an Array..!
		System.out.println("Enter the size of an Array with size 2.");
		int size = scanner.nextInt();

		int[] arr = new int[size];

// 		inserting the values in an Array...!
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter the value at array index of : " + i);
			arr[i] = scanner.nextInt();
		}

//		Fibonacci..!
		int a = arr[0];
		int b = arr[1];
		System.out.println("Enter the Maximum Number..!");
		int num = scanner.nextInt();
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		while (true) {
			if ((a + b) < num) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}

	}

}
