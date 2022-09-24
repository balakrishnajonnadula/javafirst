package com.array_assignment;

import java.util.Arrays;

public class FindTheKLargestElementInAnArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 17, 7, 25, 3, 100 };
		int k = 4;
		System.out.println("Given Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k + " Largest elements in ana array are:");
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= k; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
