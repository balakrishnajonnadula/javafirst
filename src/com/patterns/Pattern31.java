package com.patterns;

public class Pattern31 {

	public static void main(String[] args) {
		int star = 5;
		char ch = 'F';
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print((char) (ch - j) + " ");
			}
			if (i < 5) {
				star--;
				ch--;
			} else {
				star++;
				ch++;
			}
			System.out.println();
		}

	}

}
