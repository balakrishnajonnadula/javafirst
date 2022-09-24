package com.array_assignment;

import java.util.Arrays;

public class ReverseOfStringArray {

	public static void main(String[] args) {
		String[] arr = { "Rama", "Sita", "Krishna", "Shiva", "Parvathi", "Radha" };
		System.out.println("Given array is : " + Arrays.toString(arr));

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ", ");
		}

	}

}
