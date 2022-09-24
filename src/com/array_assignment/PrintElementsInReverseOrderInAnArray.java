package com.array_assignment;

import java.util.Arrays;

public class PrintElementsInReverseOrderInAnArray {

	public static void main(String[] args) {

		char[] arr = { 'h', 'i', 'o', 'U', 'B', 'j' };
		System.out.println("Given array is : " + Arrays.toString(arr));

		System.out.print("Array after reversing : [ ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

}
