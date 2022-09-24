package com.array_assignment;

import java.util.Arrays;

public class SecondSmallestInAnArray {

	public static void main(String[] args) {
		int[] arr = { 95, 87, 53, 79, 967 };
		System.out.println("Given array is : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Second smallest in an Array is : " + (arr[1]));

	}

}
