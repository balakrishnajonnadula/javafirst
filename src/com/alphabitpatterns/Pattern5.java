package com.alphabitpatterns;

public class Pattern5 {

	public static void main(String[] args) {
		int star = 6;
		char ch = 'F';
		for (int i = 1; i <= 12; i++) {
			char temp = ch;
			for (int j = 1; j <= star; j++) {
				System.out.print(temp--);
			}
			System.out.println();
			if (i < 6) {
				star--;
				ch--;
			} else if (i == 6) {

			} else {
				ch++;
				star++;
			}
		}

	}

}
