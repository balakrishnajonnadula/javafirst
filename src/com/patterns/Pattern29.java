package com.patterns;

public class Pattern29 {

	public static void main(String[] args) {
		int star = 5;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= star; j++) {
				int num = star-j;
				System.out.print((num+1) + " ");
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
