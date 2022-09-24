package com.alphabitpatterns;

public class Pattern17 {

	public static void main(String[] args) {
		int space = 6;
		int space1 = 0;
		int star = 6;
		char ch = 'A';
		for (int i = 1; i <= 12; i++) {
			char temp = ch;
			for (int j = 1; j <= space1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(temp++);
			}
			System.out.println();
			if (i < 6) {
				ch++;
				space1++;
				star--;
			} else if (i == 6) {
			} else {
				ch--;
				space1--;
				star++;
			}
		}
	}

}
