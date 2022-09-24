package com.alphabitpatterns;

public class Pattern36 {

	public static void main(String[] args) {
		char ch = 'A';
		char ch1 = 'J';
		char ch3 = 'K';
		char ch4 = 'T';
		char ch5 = 'U';
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (j == 1) {
					System.out.print(ch++);
				}
				if (j == 2) {
					System.out.print(ch1--);
				}
				if (j == 3) {
					System.out.print(ch3++);
				}
				if (j == 4) {
					System.out.print(ch4--);
				}
				if (j == 5) {
					System.out.print(ch5++);
				}
			}
			System.out.println();
		}

	}

}
