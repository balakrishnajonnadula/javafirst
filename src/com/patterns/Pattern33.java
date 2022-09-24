package com.patterns;

public class Pattern33 {

	public static void main(String[] args) {
		int space = 3;
		int star = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			int l = 1;
			for (int j = 2; j <= star; j++) {
				System.out.print(l++);

			}
			for (int j = 1; j <= 1; j++) {
				System.out.print(i);
			}
			space--;
			star++;
			int k = i;
			for (int j = 2; j <= i; j++) {
				System.out.print(--k);
			}
			System.out.println();
		}

	}

}
