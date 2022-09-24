package com.patterns;

public class Pattern34 {

	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		char ch = 'A';
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			char ch1 = 'A';
			for (int j = 2; j <= star; j++) {
				System.out.print(ch1++);

			}
			for (int j = 1; j <= 1; j++) {
				System.out.print(ch++);
			}
			space--;
			star++;
			char k = (char) (ch - 1);
			for (int j = 2; j <= i; j++) {
				System.out.print(--k);
			}
			System.out.println();
		}

	}

}
