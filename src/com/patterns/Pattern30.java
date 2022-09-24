package com.patterns;

public class Pattern30 {

	public static void main(String[] args) {
		int star = 5;
		for (int i = 1; i <= 9; i++) {
			char ch = 'A';
			for (int j = 1; j <= star; j++) {
				System.out.print(ch++ + " ");
			}
			if (i < 5) {
				star--;
			} else {
				star++;
			}
			System.out.println();
		}


	}

}
