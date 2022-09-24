package com.array_assignment;

import java.util.Arrays;

public class ReverseOfAnArray {

	public static void main(String[] args) {

		int[] arr = { 86, 75, 97, 87, 65, 74 };
		System.out.println("Given array is : " + Arrays.toString(arr));

		System.out.print("Array after reversing : [ ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");

	}

}
