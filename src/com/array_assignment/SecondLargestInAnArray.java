package com.array_assignment;

import java.util.Arrays;

public class SecondLargestInAnArray {

	public static void main(String[] args) {
		int[] arr = { 95, 76, 53, 76, 967 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Second Largest in an Array is : " + (arr[arr.length - 2]));

	}

}
