package com.array_assignment;

import java.util.Arrays;

public class RemoveTheDuplicatesInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 5, 6, 6, 8 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = (i + 1); j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		System.out.println("Array after removing duplicates..!");
		System.out.print("[ ");
		for (int ex : arr) {
			if (ex != 0)
				System.out.print(ex + " ");
		}
		System.out.print("]");

	}

}
