package com.alphabitpatterns;

public class Pattern37 {

	public static void main(String[] args) {
		int rows = 5;
		char ch = 'A';
		int temp = 0;
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= i; j--) {
				System.out.print((char) (ch + j - 1) + " ");
				temp = j;
			}
			for (int k = rows - i + 1; k < rows; k++) {
				System.out.print((char) (ch + temp - 1) + " ");
			}
			System.out.println();
		}

	}
}
