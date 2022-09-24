package com.array_assignment;

public class FindTheIndexOfArrayElement {

	public static void main(String[] args) {
		int k = 5;
		int[] arr = { 1, 2, 3, 6, 5, 10, 7, 8 };

		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == k) {
				System.out.println("The index of value K is : " + i);
			}
		}

	}

}
