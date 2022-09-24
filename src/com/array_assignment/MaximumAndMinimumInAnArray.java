package com.array_assignment;

import java.util.Arrays;

public class MaximumAndMinimumInAnArray {

	public static void main(String[] args) {
		int[] arr = { 95, 76, 53, 76, 967 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		Arrays.toString(arr);
		Arrays.sort(arr);
		System.out.println("Min number in an Array is: " + arr[0]);
		System.out.println("Max number in an Array is: " + arr[arr.length - 1]);

	}

}
