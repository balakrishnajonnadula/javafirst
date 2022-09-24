package com.array_assignment;

import java.util.Arrays;

public class PrintSumOfAllElementsInAnArray {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 75, 65, 97, 64, 60, 76, 54, 32, 98 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}

		System.out.println("Sum of total array is : " + sum);

	}

}
