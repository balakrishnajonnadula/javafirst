package com.array_assignment;

public class FindSpecificValue {

	public static void main(String[] args) {
		int specificValue = 6;
		int[] arr = { 1, 2, 3, 6, 5, 6, 7, 8 };
		for (int i = 1; i <= arr.length - 1; i++) {
			if (specificValue == arr[i]) {
				System.out.println(specificValue + " is present in an Array at the index of : " + i);
			}
		}

	}

}
