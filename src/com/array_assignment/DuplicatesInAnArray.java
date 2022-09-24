package com.array_assignment;

import java.util.Arrays;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 5, 6, 6, 8 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		System.out.print("Duplicates in an Array is : ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = (i + 1); j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + ", ");
				}
			}
		}

	}

}
