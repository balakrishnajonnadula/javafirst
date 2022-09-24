package com.array_assignment;

import java.util.Arrays;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		int specificValue = 6;
		int[] arr = { 1, 2, 3, 10, 5, 6, 7, 8 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		System.out.println("Array after removing specific element 6.");
		for (int i = 1; i <= arr.length - 1; i++) {
			if (specificValue == arr[i]) {
				arr[i] = 0;
			}
		}

		System.out.print("[ ");
		for (int ex : arr) {
			if (ex != 0)
				System.out.print(ex + " ");
		}
		System.out.print("]");

	}

}
