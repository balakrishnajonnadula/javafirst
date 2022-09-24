package com.patterns;

public class Pattern38 {

	public static void main(String[] args) {
		int space = 5;
		int star = 0;
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				space--;
				star++;
			} else {
				space++;
				star--;
			}
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
