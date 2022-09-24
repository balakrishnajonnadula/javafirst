package com.array_assignment;

import java.util.Arrays;

public class SwapTreeArraysWithTemp {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 100, 200, 300, 400, 500 };
		int[] arr3 = { 1000, 2000, 3000, 4000, 5000 };
		int[] temp = new int[arr1.length];
		System.out.println("Before swapping..!");
		System.out.println("Array - 1 : " + Arrays.toString(arr1));
		System.out.println("Array - 2 : " + Arrays.toString(arr2));
		System.out.println("Array - 3 : " + Arrays.toString(arr3));

		for (int i = 0; i <= arr1.length - 1; i++) {
			temp[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = arr3[i];
			arr3[i] = temp[i];
		}
		System.out.println();
		System.out.println("After swapping..!");
		System.out.println("Array - 1 : " + Arrays.toString(arr1));
		System.out.println("Array - 2 : " + Arrays.toString(arr2));
		System.out.println("Array - 3 : " + Arrays.toString(arr3));

	}

}
