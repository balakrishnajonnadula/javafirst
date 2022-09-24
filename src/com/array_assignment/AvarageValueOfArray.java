package com.array_assignment;

public class AvarageValueOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		avg = sum / (arr.length - 1);

		System.out.println("Sum of an array is : " + sum);
		System.out.println("Size of an array is : " + (arr.length - 1));
		System.out.println("Average of an array is : " + avg);
	}

}
