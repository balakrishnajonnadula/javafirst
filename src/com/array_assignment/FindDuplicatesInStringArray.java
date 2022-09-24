package com.array_assignment;

import java.util.Arrays;

public class FindDuplicatesInStringArray {

	public static void main(String[] args) {
		String[] arr = { "hello", "Hi", "jbk", "hello", "Hi" };
		System.out.println("Given Array is : " + Arrays.toString(arr));
		System.out.print("Duplicates in an Array : ");
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = (i + 1); j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + ". ");
				}

			}
		}

	}

}
