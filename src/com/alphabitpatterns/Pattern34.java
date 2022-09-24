package com.alphabitpatterns;

public class Pattern34 {

	public static void main(String[] args) {
		int star = 1;
		char ch = 'A';
		for (int i = 1; i <= 9; i++) {
			char temp = ch;
			for (int j = 1; j <= star; j++) {
				if (j == 1) {
					System.out.print(ch++);
				}
				if (j == 2) {
					System.out.print(temp += 2);
				}
				if (j == 3) {
					System.out.print(temp += 4);
				}
				if (j == 4) {
					System.out.print(temp += 6);
				}
				if (j == 5) {
					System.out.print(temp += 8);
				}
			}

			System.out.println();
			if (i < 5) {
				star++;
			} else {
				star--;
			}
		}

	}

}
