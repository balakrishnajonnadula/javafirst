package com.array_assignment;

import java.util.Arrays;

public class PrintTheElementsPresentInEvenPosition {

	public static void main(String[] args) {
		int[] arr = { 75, 65, 97, 64, 60, 76, 54, 32, 98 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		System.out.println("The the elements present in even position : ");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i >= 2 && i % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
