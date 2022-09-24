package com.array_assignment;

import java.util.Arrays;

public class DesecndingOrderOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 75, 65, 97, 64, 60, 76, 54, 32, 98 };
		System.out.println("Given array is : " + Arrays.toString(arr));

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println("Desending order of an Array..!");
		System.out.print("[ ");
		for (int ex : arr) {
			System.out.print(ex + " ");
		}
		System.out.print("]");

	}

}
