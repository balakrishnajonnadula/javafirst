package com.array_assignment;

import java.util.Arrays;

public class FindTheSmallestKElementInAnArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 4, 17, 7, 25, 3, 100 };
		int k = 3;
		System.out.println("Given Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println(k + " smallest elements in an array are:");
		Arrays.sort(arr);
		for (int i = 0; i <= k - 1; i++)
			System.out.print(arr[i] + " ");
	}

}
